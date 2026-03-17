const FLOW_HEADER_PATTERN = /^(flowchart|graph)\b/i;
const MINDMAP_HEADER_PATTERN = /^mindmap\b/i;

function normalizeSource(text) {
  return String(text || '')
    .replace(/\r\n?/g, '\n')
    .trim();
}

function normalizeLine(line) {
  const noComment = String(line || '').replace(/%%.*$/, '');
  return noComment.trim();
}

function slugify(value, fallback = 'node') {
  const text = String(value || '')
    .trim()
    .replace(/["'`]/g, '')
    .replace(/[^a-zA-Z0-9_]+/g, '_')
    .replace(/^_+|_+$/g, '');
  if (!text) return fallback;
  if (/^[a-zA-Z_]/.test(text)) return text;
  return `n_${text}`;
}

function asLabel(value, fallback = '') {
  const text = String(value || '').trim();
  return text || fallback;
}

function normalizeFlowNodeToken(rawToken, indexHint = 1) {
  const token = String(rawToken || '')
    .trim()
    .replace(/;$/, '');
  if (!token) return null;

  const labelPatterns = [
    /^([A-Za-z_][A-Za-z0-9_:-]*)\s*\(\((.*)\)\)$/,
    /^([A-Za-z_][A-Za-z0-9_:-]*)\s*\[(.*)\]$/,
    /^([A-Za-z_][A-Za-z0-9_:-]*)\s*\((.*)\)$/,
    /^([A-Za-z_][A-Za-z0-9_:-]*)\s*\{(.*)\}$/,
    /^([A-Za-z_][A-Za-z0-9_:-]*)\s*"(.+)"$/
  ];
  for (const pattern of labelPatterns) {
    const match = token.match(pattern);
    if (!match) continue;
    const [, id, label] = match;
    return {
      id: slugify(id, `n${indexHint}`),
      label: asLabel(label, id)
    };
  }

  if (/^".+"$/.test(token)) {
    const label = token.replace(/^"|"$/g, '').trim();
    return {
      id: slugify(label, `n${indexHint}`),
      label: asLabel(label, `Node ${indexHint}`)
    };
  }

  const idMatch = token.match(/^([A-Za-z_][A-Za-z0-9_:-]*)$/);
  if (idMatch) {
    const id = slugify(idMatch[1], `n${indexHint}`);
    return {
      id,
      label: id
    };
  }

  return {
    id: slugify(token, `n${indexHint}`),
    label: token
  };
}

function parseFlowchart(lines, startIndex) {
  const nodeMap = new Map();
  const edges = [];
  const warnings = [];
  let anonymousIndex = 1;

  function ensureNode(node) {
    if (!node?.id) return;
    const existing = nodeMap.get(node.id);
    if (!existing) {
      nodeMap.set(node.id, {
        id: node.id,
        label: asLabel(node.label, node.id)
      });
      return;
    }
    if (!existing.label && node.label) {
      existing.label = asLabel(node.label, existing.id);
    }
  }

  const edgePatterns = [
    /^(.*?)\s*--\s*(?:\|([^|]+)\|\s*)?>\s*(.*?)$/,
    /^(.*?)\s*==\s*(?:\|([^|]+)\|\s*)?>\s*(.*?)$/,
    /^(.*?)\s*-\.\s*(?:\|([^|]+)\|\s*)?->\s*(.*?)$/
  ];

  for (let index = startIndex; index < lines.length; index += 1) {
    const sourceLine = normalizeLine(lines[index]);
    if (!sourceLine) continue;
    const lowered = sourceLine.toLowerCase();
    if (
      lowered.startsWith('subgraph ') ||
      lowered === 'end' ||
      lowered.startsWith('direction ') ||
      lowered.startsWith('classdef ') ||
      lowered.startsWith('class ') ||
      lowered.startsWith('style ')
    ) {
      continue;
    }

    let matchedEdge = null;
    for (const pattern of edgePatterns) {
      const match = sourceLine.match(pattern);
      if (match) {
        matchedEdge = match;
        break;
      }
    }

    if (matchedEdge) {
      const leftNode = normalizeFlowNodeToken(matchedEdge[1], anonymousIndex);
      anonymousIndex += 1;
      const rightNode = normalizeFlowNodeToken(matchedEdge[3], anonymousIndex);
      anonymousIndex += 1;
      if (!leftNode || !rightNode) {
        warnings.push(`Skipped invalid edge line: ${sourceLine}`);
        continue;
      }
      ensureNode(leftNode);
      ensureNode(rightNode);
      edges.push({
        from: leftNode.id,
        to: rightNode.id,
        label: asLabel(matchedEdge[2], '')
      });
      continue;
    }

    const standaloneNode = normalizeFlowNodeToken(sourceLine, anonymousIndex);
    anonymousIndex += 1;
    if (!standaloneNode?.id) {
      warnings.push(`Skipped line: ${sourceLine}`);
      continue;
    }
    ensureNode(standaloneNode);
  }

  const nodes = Array.from(nodeMap.values());
  if (!nodes.length) {
    throw new Error('No supported flowchart nodes found.');
  }
  return {
    kind: 'flowchart',
    nodes,
    edges,
    warnings
  };
}

function normalizeMindmapLabel(rawLine) {
  const text = String(rawLine || '').trim();
  if (!text) return '';
  const wrappers = [
    [/^\(\((.*)\)\)$/, '$1'],
    [/^\[(.*)\]$/, '$1'],
    [/^\((.*)\)$/, '$1'],
    [/^\{(.*)\}$/, '$1'],
    [/^"(.+)"$/, '$1']
  ];
  for (const [pattern, replace] of wrappers) {
    if (!pattern.test(text)) continue;
    return asLabel(text.replace(pattern, replace), '');
  }
  return text;
}

function countLeadingIndent(rawLine) {
  let count = 0;
  for (const char of String(rawLine || '')) {
    if (char === ' ') {
      count += 1;
      continue;
    }
    if (char === '\t') {
      count += 2;
      continue;
    }
    break;
  }
  return count;
}

function parseMindmap(lines, startIndex) {
  const nodes = [];
  const edges = [];
  const stack = [];
  let seq = 1;
  const warnings = [];

  for (let index = startIndex; index < lines.length; index += 1) {
    const rawLine = String(lines[index] || '');
    const line = normalizeLine(rawLine);
    if (!line) continue;
    if (line.startsWith('::')) continue;

    const indent = countLeadingIndent(rawLine);
    const label = normalizeMindmapLabel(line);
    if (!label) {
      warnings.push(`Skipped line: ${rawLine}`);
      continue;
    }

    const nodeId = `m_${slugify(label, 'node')}_${seq}`;
    seq += 1;
    nodes.push({
      id: nodeId,
      label,
      level: stack.length
    });

    while (stack.length && indent <= stack[stack.length - 1].indent) {
      stack.pop();
    }
    if (stack.length) {
      edges.push({
        from: stack[stack.length - 1].id,
        to: nodeId,
        label: ''
      });
    }
    stack.push({ id: nodeId, indent });
  }

  if (!nodes.length) {
    throw new Error('No supported mindmap nodes found.');
  }
  return {
    kind: 'mindmap',
    nodes,
    edges,
    warnings
  };
}

export function parseMermaidTextToGraph(text) {
  const source = normalizeSource(text);
  if (!source) {
    throw new Error('Mermaid text is empty.');
  }
  const lines = source.split('\n');
  const headerIndex = lines.findIndex((line) => normalizeLine(line));
  if (headerIndex < 0) {
    throw new Error('Mermaid text is empty.');
  }

  const header = normalizeLine(lines[headerIndex]);
  if (MINDMAP_HEADER_PATTERN.test(header)) {
    return parseMindmap(lines, headerIndex + 1);
  }
  if (FLOW_HEADER_PATTERN.test(header)) {
    return parseFlowchart(lines, headerIndex + 1);
  }
  throw new Error('Only flowchart / mindmap are supported.');
}

export function createRichText(value) {
  const text = String(value || '');
  const paragraph = text
    ? { type: 'paragraph', content: [{ type: 'text', text }] }
    : { type: 'paragraph' };
  return {
    type: 'doc',
    content: [paragraph]
  };
}

export function richTextToPlainText(value) {
  const chunks = [];
  function walk(node) {
    if (!node || typeof node !== 'object') return;
    if (typeof node.text === 'string') {
      chunks.push(node.text);
    }
    if (!Array.isArray(node.content)) return;
    node.content.forEach((child) => walk(child));
  }
  walk(value);
  return chunks.join('').trim();
}

function escapeLabel(value) {
  return String(value || '')
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\n+/g, ' ');
}

function buildFlowchartText(graph) {
  const nodes = Array.isArray(graph?.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph?.edges) ? graph.edges : [];
  const lines = ['flowchart TD'];

  const tokenMap = new Map();
  nodes.forEach((node, index) => {
    const token = slugify(node.id || node.label || `n${index + 1}`, `n${index + 1}`);
    tokenMap.set(node.id, token);
    lines.push(`  ${token}["${escapeLabel(node.label || token)}"]`);
  });

  edges.forEach((edge) => {
    const from = tokenMap.get(edge.from) || slugify(edge.from, 'from');
    const to = tokenMap.get(edge.to) || slugify(edge.to, 'to');
    const label = asLabel(edge.label, '');
    if (label) {
      lines.push(`  ${from} -->|${escapeLabel(label)}| ${to}`);
      return;
    }
    lines.push(`  ${from} --> ${to}`);
  });

  return lines.join('\n');
}

function buildMindmapText(graph) {
  const nodes = Array.isArray(graph?.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph?.edges) ? graph.edges : [];
  if (!nodes.length) {
    return 'mindmap\n  Root';
  }

  const idToNode = new Map(nodes.map((node) => [node.id, node]));
  const childrenMap = new Map();
  const indegree = new Map(nodes.map((node) => [node.id, 0]));
  edges.forEach((edge) => {
    if (!idToNode.has(edge.from) || !idToNode.has(edge.to)) return;
    const list = childrenMap.get(edge.from) || [];
    list.push(edge.to);
    childrenMap.set(edge.from, list);
    indegree.set(edge.to, (indegree.get(edge.to) || 0) + 1);
  });

  let root = nodes.find((node) => (indegree.get(node.id) || 0) === 0) || nodes[0];
  if (!root) root = nodes[0];

  const lines = ['mindmap', `  ${escapeLabel(root.label || root.id)}`];
  const visited = new Set([root.id]);

  function walk(nodeId, depth) {
    const children = childrenMap.get(nodeId) || [];
    children.forEach((childId) => {
      if (visited.has(childId)) return;
      visited.add(childId);
      const child = idToNode.get(childId);
      if (!child) return;
      lines.push(`${'  '.repeat(depth + 1)}${escapeLabel(child.label || child.id)}`);
      walk(childId, depth + 1);
    });
  }

  walk(root.id, 1);

  nodes.forEach((node) => {
    if (visited.has(node.id)) return;
    lines.push(`  ${escapeLabel(node.label || node.id)}`);
    walk(node.id, 1);
  });

  return lines.join('\n');
}

export function graphToMermaidText(graph, preferredKind = 'flowchart') {
  const kind = String(preferredKind || graph?.kind || 'flowchart').toLowerCase();
  if (kind === 'mindmap') {
    return buildMindmapText(graph);
  }
  return buildFlowchartText(graph);
}
