import { describe, expect, it, vi } from 'vitest';
import { useDailyQuoteResource, useSiteWeatherResource } from './useSiteWidgets';

describe('site widget composables', () => {
  it('does not request nearby weather without explicit consent', async () => {
    const loadSite = vi.fn().mockResolvedValue({ available: true, locationLabel: '杭州' });
    const loadNearby = vi.fn();
    const weather = useSiteWeatherResource({ immediate: false, loadSite, loadNearby });

    await expect(weather.requestNearbyWeather({ latitude: 30, longitude: 120, consent: false }))
      .rejects.toThrow('consent');
    expect(loadNearby).not.toHaveBeenCalled();

    await weather.showSiteWeather();
    expect(loadSite).toHaveBeenCalledOnce();
  });

  it('switches to nearby data only after consent and can return to site weather', async () => {
    const loadSite = vi.fn().mockResolvedValue({ available: true, locationLabel: '杭州' });
    const loadNearby = vi.fn().mockResolvedValue({ available: true, locationLabel: '附近位置' });
    const weather = useSiteWeatherResource({ immediate: false, loadSite, loadNearby });

    await weather.requestNearbyWeather({ latitude: 30.2, longitude: 120.1, consent: true });
    expect(loadNearby.mock.calls[0][0]).toMatchObject({ latitude: 30.2, longitude: 120.1, consent: true });
    expect(weather.data.value.locationLabel).toBe('附近位置');

    await weather.showSiteWeather();
    expect(weather.data.value.locationLabel).toBe('杭州');
  });

  it('uses the local-alternative endpoint without replacing the today loader', async () => {
    const loadToday = vi.fn().mockResolvedValue({ available: true, snapshotId: 9, text: 'Today' });
    const loadAlternative = vi.fn().mockResolvedValue({ available: true, localQuoteId: 12, text: 'Local' });
    const quote = useDailyQuoteResource({ immediate: false, loadToday, loadAlternative });

    await quote.showToday();
    await quote.showLocalAlternative(12);
    expect(loadAlternative.mock.calls[0][0]).toBe(12);
    expect(quote.data.value.text).toBe('Local');

    await quote.showToday();
    expect(loadToday).toHaveBeenCalledTimes(2);
    expect(quote.data.value.text).toBe('Today');
  });
});
