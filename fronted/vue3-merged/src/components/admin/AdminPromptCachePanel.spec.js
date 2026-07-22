import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AdminPromptCachePanel from './AdminPromptCachePanel.vue';

function mountPanel(props = {}) {
  return mount(AdminPromptCachePanel, {
    props: {
      snapshot: {
        available: true,
        receivedAt: '2026-07-22T09:00:00Z',
        stale: false,
        metrics: {
          sourceId: 'meguri-desktop',
          provider: 'openai-compatible/langchain4j',
          model: 'deepseek-chat',
          cacheMode: 'provider_managed_prefix_cache',
          promptSha256: '0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef',
          promptCharacters: 800,
          totalRequests: 2,
          successfulRequests: 2,
          failedRequests: 0,
          usageReportedRequests: 2,
          cacheReportedRequests: 2,
          promptTokens: 120,
          outputTokens: 30,
          totalTokens: 150,
          cacheHitTokens: 80,
          cacheMissTokens: 40,
          cacheHitRate: 2 / 3,
          usageCoverageRate: 1,
          persistenceStatus: 'ready',
          exportStatus: 'ok',
          collectingSince: '2026-07-22T08:00:00Z',
          daily: [
            { date: '2026-07-22', cacheHitTokens: 80, cacheMissTokens: 40 }
          ],
          recent: [
            {
              observedAt: '2026-07-22T09:00:00Z',
              operation: 'turn',
              successful: true,
              cacheReported: true,
              promptTokens: 120,
              cacheHitTokens: 80,
              cacheMissTokens: 40
            }
          ]
        }
      },
      ...props
    }
  });
}

describe('AdminPromptCachePanel', () => {
  it('renders cache ratio, token totals and recent operation', () => {
    const wrapper = mountPanel();

    expect(wrapper.text()).toContain('66.7%');
    expect(wrapper.text()).toContain('deepseek-chat');
    expect(wrapper.text()).toContain('turn');
    expect(wrapper.text()).toContain('数据新鲜');
  });

  it('shows setup guidance when no snapshot is available', () => {
    const wrapper = mountPanel({ snapshot: { available: false } });

    expect(wrapper.text()).toContain('暂无上报数据');
  });

  it('emits refresh only when the admin clicks refresh', async () => {
    const wrapper = mountPanel();

    await wrapper.find('button').trigger('click');
    expect(wrapper.emitted('refresh')).toHaveLength(1);
  });
});
