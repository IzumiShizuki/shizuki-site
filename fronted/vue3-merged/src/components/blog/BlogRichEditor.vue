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
  }
});

const emit = defineEmits(['update:modelValue', 'mode-change', 'ready', 'paste-candidate']);

const hostRef = ref(null);
const loading = ref(true);
const currentMode = ref(props.defaultMode === 'markdown' ? 'markdown' : 'wysiwyg');

let editorInstance = null;
let editorRootElement = null;
let syncingFromProps = false;
let pasteGuard = false;

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
}

function handlePasteCapture(event) {
  if (!editorInstance || pasteGuard) return;
  const clipboardText = event?.clipboardData?.getData('text/plain');
  if (!clipboardText) return;
  if (!looksLikeMarkdown(clipboardText, 2)) return;
  event.preventDefault();
  emit('paste-candidate', normalizeMarkdownForEditor(clipboardText));
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
}

function setMode(mode) {
  if (!editorInstance) return;
  const normalized = normalizeMode(mode);
  if (currentMode.value === normalized) return;
  editorInstance.changeMode(normalized, false);
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
  insertText
});
</script>
