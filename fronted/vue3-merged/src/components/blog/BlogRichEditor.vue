<template>
  <div class="blog-rich-editor">
    <div v-if="loading" class="editor-loading">编辑器加载中...</div>
    <div ref="hostRef" class="editor-host"></div>
  </div>
</template>

<script setup>
import { onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { looksLikeMarkdown, normalizeMarkdownForEditor } from '../../utils/blogMarkdown';
import '../../styles/blog-editor-theme.css';

const props = defineProps({
  modelValue: {
    type: String,
    default: ''
  },
  defaultMode: {
    type: String,
    default: 'wysiwyg'
  },
  placeholder: {
    type: String,
    default: ''
  },
  readOnly: {
    type: Boolean,
    default: false
  },
  imageUploadHandler: {
    type: Function,
    default: null
  }
});

const emit = defineEmits(['update:modelValue', 'mode-change', 'ready', 'paste-candidate', 'markdown-file-drop', 'markdown-file-rejected']);

const hostRef = ref(null);
const loading = ref(true);
const currentMode = ref(props.defaultMode === 'markdown' ? 'markdown' : 'wysiwyg');

let editorInstance = null;
let editorRootElement = null;
let syncingFromProps = false;
let pasteGuard = false;

function inferImageExtension(contentType) {
  const normalized = String(contentType || '').toLowerCase();
  if (normalized === 'image/jpeg') return 'jpg';
  if (normalized === 'image/webp') return 'webp';
  if (normalized === 'image/gif') return 'gif';
  return 'png';
}

function normalizeMode(mode) {
  return String(mode || '').toLowerCase() === 'markdown' ? 'markdown' : 'wysiwyg';
}

function emitMarkdownUpdate() {
  if (!editorInstance || syncingFromProps) return;
  const markdown = normalizeMarkdownForEditor(editorInstance.getMarkdown());
  emit('update:modelValue', markdown);
}

function removePasteListener() {
  if (!editorRootElement) return;
  editorRootElement.removeEventListener('paste', handlePasteCapture, true);
  editorRootElement.removeEventListener('dragover', handleDragOverCapture, true);
  editorRootElement.removeEventListener('drop', handleDropCapture, true);
}

function handlePasteCapture(event) {
  if (!editorInstance || pasteGuard) return;
  const clipboardText = event?.clipboardData?.getData('text/plain');
  if (!clipboardText) return;
  if (!looksLikeMarkdown(clipboardText, 2)) return;
  event.preventDefault();
  emit('paste-candidate', normalizeMarkdownForEditor(clipboardText));
}

function isMarkdownLikeFile(file) {
  if (!(file instanceof File)) return false;
  const name = String(file.name || '').toLowerCase();
  if (name.endsWith('.md') || name.endsWith('.markdown') || name.endsWith('.txt')) {
    return true;
  }
  const contentType = String(file.type || '').toLowerCase();
  return contentType === 'text/markdown' || contentType === 'text/plain' || contentType === 'application/octet-stream';
}

function findMarkdownFileFromDataTransfer(dataTransfer) {
  if (!(dataTransfer instanceof DataTransfer)) return null;
  const files = Array.from(dataTransfer.files || []);
  return files.find((file) => isMarkdownLikeFile(file)) || null;
}

function handleDragOverCapture(event) {
  const files = Array.from(event?.dataTransfer?.files || []);
  if (!files.length) return;
  event.preventDefault();
  if (!event.dataTransfer) return;
  event.dataTransfer.dropEffect = files.some((file) => isMarkdownLikeFile(file)) ? 'copy' : 'none';
}

function handleDropCapture(event) {
  const files = Array.from(event?.dataTransfer?.files || []);
  if (!files.length) return;
  event.preventDefault();
  const markdownFile = findMarkdownFileFromDataTransfer(event?.dataTransfer);
  if (!(markdownFile instanceof File)) {
    emit('markdown-file-rejected', files[0]?.name || '');
    return;
  }
  emit('markdown-file-drop', markdownFile);
}

function bindPasteListener() {
  removePasteListener();
  const host = hostRef.value;
  if (!(host instanceof HTMLElement)) return;
  editorRootElement = host.querySelector('.toastui-editor-defaultUI');
  if (!(editorRootElement instanceof HTMLElement)) {
    editorRootElement = null;
    return;
  }
  editorRootElement.addEventListener('paste', handlePasteCapture, true);
  editorRootElement.addEventListener('dragover', handleDragOverCapture, true);
  editorRootElement.addEventListener('drop', handleDropCapture, true);
}

function setMode(mode) {
  if (!editorInstance) return;
  const normalized = normalizeMode(mode);
  if (currentMode.value === normalized) return;
  editorInstance.changeMode(normalized, false);
}

function execEditorCommand(command, payload) {
  if (!editorInstance || typeof editorInstance.exec !== 'function') return false;
  editorInstance.focus();
  editorInstance.exec(command, payload);
  return true;
}

function setMarkdown(markdown) {
  if (!editorInstance) return;
  const normalized = normalizeMarkdownForEditor(markdown);
  const current = normalizeMarkdownForEditor(editorInstance.getMarkdown());
  if (normalized === current) return;
  syncingFromProps = true;
  editorInstance.setMarkdown(normalized, false);
  syncingFromProps = false;
}

function getMarkdown() {
  if (!editorInstance) return normalizeMarkdownForEditor(props.modelValue);
  return normalizeMarkdownForEditor(editorInstance.getMarkdown());
}

function focus() {
  if (!editorInstance) return;
  editorInstance.focus();
}

function refreshLayout() {
  if (!editorInstance) return;
  if (typeof editorInstance.layout === 'function') {
    editorInstance.layout();
  }
  bindPasteListener();
  requestAnimationFrame(() => {
    window.dispatchEvent(new Event('resize'));
  });
}

function insertText(text) {
  if (!editorInstance) return;
  const normalized = normalizeMarkdownForEditor(text);
  if (!normalized) return;
  const previousMode = currentMode.value;
  pasteGuard = true;
  try {
    if (typeof editorInstance.insertText === 'function') {
      if (previousMode !== 'markdown') {
        editorInstance.changeMode('markdown', false);
      }
      editorInstance.insertText(normalized);
      if (previousMode !== 'markdown') {
        editorInstance.changeMode(previousMode, false);
      }
    } else {
      const current = normalizeMarkdownForEditor(editorInstance.getMarkdown());
      const merged = current ? `${current}\n\n${normalized}` : normalized;
      editorInstance.setMarkdown(merged, false);
    }
    emitMarkdownUpdate();
  } finally {
    pasteGuard = false;
  }
}

async function handleAddImageBlob(blob, callback) {
  if (typeof props.imageUploadHandler !== 'function') return true;
  if (!(blob instanceof Blob)) return true;
  const contentType = String(blob.type || '').toLowerCase();
  if (!contentType.startsWith('image/')) return true;

  const file = blob instanceof File
    ? blob
    : new File([blob], `blog-inline-${Date.now()}.${inferImageExtension(contentType)}`, {
        type: contentType || 'image/png'
      });

  try {
    const result = await props.imageUploadHandler(file);
    const url = typeof result === 'string' ? result.trim() : String(result?.url || '').trim();
    if (!url) {
      throw new Error('图片上传未返回地址');
    }
    callback(url, file.name || 'blog-image');
  } catch (error) {
    console.error('[BlogRichEditor] image upload failed', error);
  }
  return false;
}

function applyEditorAction(action, payload = {}) {
  if (!editorInstance) return false;
  const normalizedAction = String(action || '').trim().toLowerCase();
  switch (normalizedAction) {
    case 'bold':
      return execEditorCommand('bold');
    case 'italic':
      return execEditorCommand('italic');
    case 'strike':
      return execEditorCommand('strike');
    case 'heading': {
      const level = Number(payload.level);
      return execEditorCommand('heading', { level: Number.isFinite(level) ? level : 1 });
    }
    case 'paragraph':
      return execEditorCommand('heading', { level: 0 });
    case 'blockquote':
      return execEditorCommand('blockQuote');
    case 'bullet-list':
      return execEditorCommand('bulletList');
    case 'ordered-list':
      return execEditorCommand('orderedList');
    case 'task-list':
      return execEditorCommand('taskList');
    case 'inline-code':
      return execEditorCommand('code');
    case 'code-block':
      return execEditorCommand('codeBlock');
    case 'hr':
      return execEditorCommand('hr');
    case 'table':
      return execEditorCommand('table', {
        rowCount: Number.isFinite(Number(payload.rowCount)) ? Number(payload.rowCount) : 2,
        columnCount: Number.isFinite(Number(payload.columnCount)) ? Number(payload.columnCount) : 2,
        data: []
      });
    case 'link': {
      const selectedText = String(editorInstance.getSelectedText?.() || '').trim();
      const defaultText = String(payload.linkText || selectedText || '');
      const defaultUrl = String(payload.linkUrl || 'https://');
      const linkUrl = window.prompt('请输入链接地址', defaultUrl);
      if (!linkUrl || !linkUrl.trim()) return false;
      return execEditorCommand('addLink', {
        linkUrl: linkUrl.trim(),
        linkText: defaultText || linkUrl.trim()
      });
    }
    case 'mode-markdown':
      setMode('markdown');
      return true;
    case 'mode-wysiwyg':
      setMode('wysiwyg');
      return true;
    default:
      return false;
  }
}

onMounted(async () => {
  const host = hostRef.value;
  if (!(host instanceof HTMLElement)) return;
  const normalizedMode = normalizeMode(props.defaultMode);
  currentMode.value = normalizedMode;

  const editorModule = await import('@toast-ui/editor');
  await Promise.all([
    import('@toast-ui/editor/dist/toastui-editor.css'),
    import('@toast-ui/editor/dist/theme/toastui-editor-dark.css')
  ]);

  const EditorCtor = editorModule?.default || editorModule?.Editor;
  if (!EditorCtor) {
    throw new Error('无法加载 Toast UI Editor');
  }

  editorInstance = new EditorCtor({
    el: host,
    initialValue: normalizeMarkdownForEditor(props.modelValue),
    initialEditType: normalizedMode,
    previewStyle: 'tab',
    height: '100%',
    hideModeSwitch: true,
    usageStatistics: false,
    placeholder: props.placeholder || '',
    theme: 'dark'
  });

  if (props.readOnly && typeof editorInstance.setReadOnly === 'function') {
    editorInstance.setReadOnly(true);
  }

  editorInstance.on('change', () => {
    emitMarkdownUpdate();
  });

  editorInstance.on('changeMode', (nextMode) => {
    currentMode.value = normalizeMode(nextMode);
    emit('mode-change', currentMode.value);
  });

  if (typeof props.imageUploadHandler === 'function' && typeof editorInstance.addHook === 'function') {
    editorInstance.addHook('addImageBlobHook', handleAddImageBlob);
  }

  loading.value = false;
  bindPasteListener();
  emit('ready');
  emit('mode-change', currentMode.value);
});

onBeforeUnmount(() => {
  removePasteListener();
  if (editorInstance && typeof editorInstance.destroy === 'function') {
    editorInstance.destroy();
  }
  editorInstance = null;
  editorRootElement = null;
});

watch(
  () => props.modelValue,
  (nextValue) => {
    if (!editorInstance) return;
    const normalized = normalizeMarkdownForEditor(nextValue);
    const current = normalizeMarkdownForEditor(editorInstance.getMarkdown());
    if (normalized === current) return;
    syncingFromProps = true;
    editorInstance.setMarkdown(normalized, false);
    syncingFromProps = false;
  }
);

watch(
  () => props.readOnly,
  (nextValue) => {
    if (!editorInstance || typeof editorInstance.setReadOnly !== 'function') return;
    editorInstance.setReadOnly(Boolean(nextValue));
  }
);

defineExpose({
  focus,
  setMarkdown,
  getMarkdown,
  setMode,
  insertText,
  refreshLayout,
  applyEditorAction
});
</script>
