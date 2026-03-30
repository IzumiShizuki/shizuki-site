import mermaid from 'mermaid';

let initialized = false;
let renderCounter = 0;

function isElementNode(value) {
  return Boolean(value && typeof value === 'object' && value.nodeType === 1);
}

function readErrorMessage(error) {
  return String(error?.str || error?.message || 'Mermaid 渲染失败').trim() || 'Mermaid 渲染失败';
}

function ensureInitialized() {
  if (initialized) return;
  mermaid.initialize({
    startOnLoad: false,
    securityLevel: 'loose',
    theme: 'default'
  });
  initialized = true;
}

function buildErrorBlock(source, message) {
  const wrapper = document.createElement('div');
  wrapper.className = 'md-mermaid-error';

  const title = document.createElement('strong');
  title.textContent = 'Mermaid 渲染失败';
  wrapper.appendChild(title);

  const detail = document.createElement('p');
  detail.textContent = message;
  wrapper.appendChild(detail);

  if (String(source || '').trim()) {
    const pre = document.createElement('pre');
    pre.textContent = source;
    wrapper.appendChild(pre);
  }

  return wrapper;
}

export async function renderMermaidBlocks(root) {
  if (!isElementNode(root)) return [];

  ensureInitialized();

  const blocks = Array.from(root.querySelectorAll('pre.md-code > code[data-lang="mermaid"]'));
  const results = [];

  for (const codeNode of blocks) {
    const preNode = codeNode.parentElement;
    if (!isElementNode(preNode) || preNode.dataset.mermaidRendered === 'true') {
      continue;
    }

    const source = String(codeNode.textContent || '').trim();
    if (!source) continue;

    try {
      await mermaid.parse(source);
      const renderId = `blog_mermaid_${Date.now()}_${renderCounter += 1}`;
      const rendered = await mermaid.render(renderId, source);

      const wrapper = document.createElement('div');
      wrapper.className = 'md-mermaid-block';
      wrapper.innerHTML = String(rendered?.svg || '').trim();

      if (!wrapper.innerHTML) {
        throw new Error('Mermaid 未返回可渲染 SVG');
      }

      preNode.dataset.mermaidRendered = 'true';
      preNode.replaceWith(wrapper);
      if (typeof rendered?.bindFunctions === 'function') {
        rendered.bindFunctions(wrapper);
      }
      results.push({
        status: 'rendered',
        source,
        container: wrapper
      });
    } catch (error) {
      const errorNode = buildErrorBlock(source, readErrorMessage(error));
      preNode.dataset.mermaidRendered = 'true';
      preNode.replaceWith(errorNode);
      results.push({
        status: 'error',
        source,
        message: readErrorMessage(error),
        container: errorNode
      });
    }
  }

  return results;
}
