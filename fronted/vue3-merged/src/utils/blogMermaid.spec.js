import { beforeEach, describe, expect, it, vi } from 'vitest';
import mermaid from 'mermaid';
import { renderMermaidBlocks } from './blogMermaid';

vi.mock('mermaid', () => ({
  default: {
    initialize: vi.fn(),
    parse: vi.fn(),
    render: vi.fn()
  }
}));

describe('blogMermaid', () => {
  beforeEach(() => {
    document.body.innerHTML = '';
    vi.clearAllMocks();
  });

  it('replaces mermaid code fences with svg output', async () => {
    document.body.innerHTML = `
      <article>
        <pre class="md-code"><code data-lang="mermaid">graph TD\nA-->B</code></pre>
      </article>
    `;

    mermaid.parse.mockResolvedValue(undefined);
    mermaid.render.mockResolvedValue({
      svg: '<svg data-test="mermaid"></svg>',
      bindFunctions: vi.fn()
    });

    const results = await renderMermaidBlocks(document.body);

    expect(results).toHaveLength(1);
    expect(results[0].status).toBe('rendered');
    expect(document.body.querySelector('.md-mermaid-block svg[data-test="mermaid"]')).not.toBeNull();
    expect(document.body.querySelector('pre.md-code')).toBeNull();
  });

  it('renders an error block when mermaid parse fails', async () => {
    document.body.innerHTML = `
      <article>
        <pre class="md-code"><code data-lang="mermaid">graph TD\nA-->B</code></pre>
      </article>
    `;

    mermaid.parse.mockRejectedValue(new Error('bad graph'));

    const results = await renderMermaidBlocks(document.body);

    expect(results).toHaveLength(1);
    expect(results[0].status).toBe('error');
    expect(document.body.querySelector('.md-mermaid-error')).not.toBeNull();
    expect(document.body.textContent).toContain('bad graph');
  });
});
