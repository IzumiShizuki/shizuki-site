import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function readSource(relativePath) {
  return readFileSync(resolve(process.cwd(), relativePath), 'utf8');
}

describe('BlogPage workspace architecture', () => {
  it('delegates structural scroll ownership to explicit reader and editor workspaces', () => {
    const source = readSource('src/pages/BlogPage.vue');
    const reader = readSource('src/components/blog/BlogReaderWorkspace.vue');
    const editor = readSource('src/components/blog/BlogEditorWorkspace.vue');

    expect(source).toContain("import BlogReaderWorkspace from '../components/blog/BlogReaderWorkspace.vue'");
    expect(source).toContain("import BlogEditorWorkspace from '../components/blog/BlogEditorWorkspace.vue'");
    expect(source).toContain(':is="activeWorkspaceComponent"');
    expect(reader).toContain('data-blog-workspace="reader"');
    expect(reader).toContain('data-scroll-owner="center"');
    expect(source).toContain(':app-scroll-owner="!isMobileLike"');
    expect(source).toContain('tag="section"');
    expect(editor).toContain('data-blog-workspace="editor"');
    expect(editor).toContain('data-scroll-owner="workspace"');
  });

  it('does not retain the obsolete Blog list compatibility controller', () => {
    const source = readSource('src/pages/BlogPage.vue');

    expect(source).not.toContain("viewMode === 'list'");
    expect(source).not.toContain("viewMode.value = 'list'");
    expect(source).not.toContain('const listState = reactive');
    expect(source).not.toContain('function loadPostList');
    expect(source).not.toContain('function handleSearchSubmit');
  });

  it('has one event-listener owner for reader progress and protects dirty editor navigation', () => {
    const source = readSource('src/pages/BlogPage.vue');

    expect(source.match(/addEventListener\('scroll', handleDetailScroll/g) || []).toHaveLength(1);
    expect(source).toContain('onBeforeRouteLeave');
    expect(source).toContain('onBeforeRouteUpdate');
    expect(source).toContain("window.addEventListener('beforeunload', handleBeforeUnload)");
    expect(source).toContain('editorHasUnsavedChanges');
  });
});
