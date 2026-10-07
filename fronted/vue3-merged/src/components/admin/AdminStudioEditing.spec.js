import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { createMemoryHistory, createRouter, RouterView } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AdminAlbumsWorkspace from './AdminAlbumsWorkspace.vue';
import AdminMomentsWorkspace from './AdminMomentsWorkspace.vue';
import * as api from '../../services/adminLifeContentApi';

vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => ({
  ensureReady: vi.fn().mockResolvedValue(), isAuthenticated: ref(true), authorizedFetch: vi.fn()
}) }));
vi.mock('../../services/adminLifeContentApi', async (importOriginal) => {
  const original = await importOriginal();
  return Object.fromEntries(Object.keys(original).map((key) => [key, vi.fn()]));
});

function album(id = 1) {
  return { id, title: `Album ${id}`, summary: '', lifecycle: 'DRAFT', visibility: 'PRIVATE', audit: { etag: 'a1' },
    coverPhotoId: 10, photos: [10, 11].map((photoId) => ({ photoId, title: 'Photo', altText: 'Alt', caption: '', downloadMode: 'NONE', processing: { status: 'READY', readyForPublication: true, variants: [] } })) };
}
function moment(id = 1) {
  return { id, body: `Moment ${id}`, excerpt: `Moment ${id}`, lifecycle: 'DRAFT', visibility: 'PRIVATE', etag: 'm1',
    photos: [10, 11].map((photoId) => ({ photoId, altText: 'Alt', processingStatus: 'READY', derivatives: ['THUMB_WEBP', 'DISPLAY_WEBP', 'FULL_SANITIZED'].map((variant) => ({ variant, status: 'READY', auditStatus: 'APPROVED', deliveryScope: 'PRIVATE_WORKING' })) })) };
}
const studios = [
  { name: 'album', component: AdminAlbumsWorkspace, item: album, index: '.album-index__item', field: '.editor-section--fields input', get: 'getAdminAlbum', reorder: 'reorderAdminAlbumPhotos', save: 'updateAdminAlbum', publish: 'publishAdminAlbum' },
  { name: 'moment', component: AdminMomentsWorkspace, item: moment, index: '.moment-index__item', field: '.moment-copy-editor textarea', get: 'getAdminMoment', reorder: 'reorderAdminMomentPhotos', save: 'updateAdminMoment', publish: 'publishAdminMoment' }
];

async function openStudio(studio) {
  const router = createRouter({ history: createMemoryHistory(), routes: [
    { path: '/author', component: studio.component }, { path: '/elsewhere', component: { template: '<div />' } }
  ] });
  await router.push('/author?tab=studio');
  const wrapper = mount(RouterView, { global: { plugins: [router], stubs: { AdminProtectedMediaImage: true, AdminMediaProcessingStatus: true } } });
  await flushPromises();
  await wrapper.findAll(studio.index)[0].trigger('click');
  await flushPromises();
  return { wrapper, router };
}
function button(wrapper, label) { return wrapper.findAll('button').find((node) => node.text() === label); }

describe.each(studios)('$name studio draft integrity', (studio) => {
  beforeEach(() => {
    vi.clearAllMocks();
    api.listAdminAlbums.mockResolvedValue([album(1), album(2)]);
    api.listAdminMoments.mockResolvedValue([moment(1), moment(2)]);
    api.listAdminManagedPhotos.mockResolvedValue([]);
    api.getAdminAlbum.mockImplementation(async (id) => album(id));
    api.getAdminMoment.mockImplementation(async (id) => moment(id));
    api.reorderAdminAlbumPhotos.mockResolvedValue(album());
    api.reorderAdminMomentPhotos.mockResolvedValue(moment());
  });

  it('retains edited text when a photo is reordered', async () => {
    const { wrapper } = await openStudio(studio);
    await wrapper.get(studio.field).setValue('Unsaved text');
    await wrapper.findAll(studio.name === 'album' ? '[aria-label="下移照片"]' : '[aria-label="下移动态照片"]')[0].trigger('click');
    await flushPromises();
    expect(api[studio.reorder]).toHaveBeenCalledTimes(1);
    expect(wrapper.get(studio.field).element.value).toBe('Unsaved text');
    wrapper.unmount();
  });

  it('keeps the current item when discard is declined and blocks publishing a dirty draft', async () => {
    const { wrapper, router } = await openStudio(studio);
    await wrapper.get(studio.field).setValue('Unsaved text');
    expect(button(wrapper, '发布').attributes('disabled')).toBeDefined();
    expect(button(wrapper, '预览').attributes('disabled')).toBeDefined();
    const confirm = vi.spyOn(window, 'confirm').mockReturnValue(false);
    await wrapper.findAll(studio.index)[1].trigger('click');
    await flushPromises();
    expect(api[studio.get]).toHaveBeenCalledTimes(1);
    await router.push('/elsewhere');
    expect(router.currentRoute.value.path).toBe('/author');
    expect(wrapper.get(studio.field).element.value).toBe('Unsaved text');
    confirm.mockRestore();
    wrapper.unmount();
  });

  it('clears draft guidance after saving and then enables preview and publish', async () => {
    const { wrapper } = await openStudio(studio);
    const saved = { ...studio.item(), [studio.name === 'album' ? 'title' : 'body']: 'Saved text' };
    api[studio.save].mockResolvedValueOnce(saved);
    api[studio.get].mockResolvedValueOnce(saved);
    await wrapper.get(studio.field).setValue('Saved text');
    await button(wrapper, '保存').trigger('click');
    await flushPromises();
    expect(api[studio.save]).toHaveBeenCalledTimes(1);
    expect(button(wrapper, '预览').attributes('disabled')).toBeUndefined();
    expect(button(wrapper, '发布').attributes('disabled')).toBeUndefined();
    wrapper.unmount();
  });

  it('retains selected library photos when attachment fails', async () => {
    api.listAdminManagedPhotos.mockResolvedValueOnce([{ id: 20, title: 'Photo', altText: 'Alt', processingStatus: 'READY' }]);
    const attach = studio.name === 'album' ? 'attachAdminAlbumPhotos' : 'attachAdminMomentPhotos';
    api[attach].mockRejectedValueOnce(new Error('Attach failed'));
    const { wrapper } = await openStudio(studio);
    const selector = studio.name === 'album' ? '.library-photo__select input' : '.library-photo input';
    await wrapper.get(selector).setValue(true);
    await button(wrapper, '复用所选照片').trigger('click');
    await flushPromises();
    expect(api[attach]).toHaveBeenCalledTimes(1);
    expect(wrapper.get(selector).element.checked).toBe(true);
    wrapper.unmount();
  });
});

it('preserves unsaved photo captions and download policy while an album is reordered', async () => {
  api.listAdminAlbums.mockResolvedValue([album()]);
  api.listAdminManagedPhotos.mockResolvedValue([]);
  api.getAdminAlbum.mockResolvedValue(album());
  api.reorderAdminAlbumPhotos.mockResolvedValue(album());
  const { wrapper } = await openStudio(studios[0]);
  await wrapper.findAll('.album-photo textarea')[0].setValue('Unsaved caption');
  await wrapper.findAll('.photo-policy select')[0].setValue('SANITIZED');
  await wrapper.findAll('[aria-label="下移照片"]')[0].trigger('click');
  await flushPromises();
  expect(wrapper.findAll('.album-photo textarea')[0].element.value).toBe('Unsaved caption');
  expect(wrapper.findAll('.photo-policy select')[0].element.value).toBe('SANITIZED');
  wrapper.unmount();
});
