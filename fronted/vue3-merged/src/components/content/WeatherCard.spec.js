import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests } from '../../composables/useMotionPreference';
import WeatherCard from './WeatherCard.vue';

const siteWeather = Object.freeze({
  available: true,
  freshness: 'fresh',
  locationLabel: '杭州',
  temperature: 28.4,
  apparentTemperature: 30.1,
  relativeHumidity: 62,
  weatherCode: 2,
  windSpeed: 8.2,
  observedAt: '2026-08-29T01:00:00Z',
  fetchedAt: '2026-08-29T01:05:00Z',
  forecast: [{
    date: '2026-08-30',
    minimumTemperature: 23,
    maximumTemperature: 31,
    weatherCode: 2,
    precipitationProbability: 20
  }],
  attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
});

function mountCard({ loadSite, loadNearby, geolocation } = {}) {
  return mount(WeatherCard, {
    attachTo: document.body,
    props: {
      loadSite: loadSite || vi.fn().mockResolvedValue(siteWeather),
      loadNearby: loadNearby || vi.fn(),
      geolocation: geolocation || null
    }
  });
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  document.body.innerHTML = '';
});

afterEach(() => {
  document.body.innerHTML = '';
  __resetMotionPreferenceForTests();
});

describe('WeatherCard', () => {
  it('loads only site weather until an explicit My Weather action grants location', async () => {
    const loadSite = vi.fn().mockResolvedValue(siteWeather);
    const loadNearby = vi.fn().mockResolvedValue({
      ...siteWeather,
      locationLabel: '附近位置',
      temperature: 26
    });
    const getCurrentPosition = vi.fn((resolve) => resolve({
      coords: { latitude: 30.25, longitude: 120.18 }
    }));
    const wrapper = mountCard({ loadSite, loadNearby, geolocation: { getCurrentPosition } });
    await flushPromises();

    expect(loadSite).toHaveBeenCalledOnce();
    expect(getCurrentPosition).not.toHaveBeenCalled();
    expect(loadNearby).not.toHaveBeenCalled();
    expect(wrapper.text()).toContain('杭州');

    const myWeather = wrapper.findAll('.widget-actions button').find((button) => button.text().includes('我的天气'));
    await myWeather.trigger('click');
    await flushPromises();
    expect(getCurrentPosition).toHaveBeenCalledOnce();
    expect(loadNearby).toHaveBeenCalledWith(expect.objectContaining({
      latitude: 30.25,
      longitude: 120.18,
      consent: true,
      signal: expect.any(AbortSignal)
    }));
    expect(wrapper.text()).toContain('附近位置');
    expect(wrapper.text()).toContain('明确授权');

    await wrapper.findAll('.widget-actions button')
      .find((button) => button.text().includes('返回站点天气'))
      .trigger('click');
    await flushPromises();
    expect(loadSite).toHaveBeenCalledTimes(2);
    expect(wrapper.text()).toContain('杭州');
    wrapper.unmount();
  });

  it('keeps site weather when geolocation is denied and sends no nearby request', async () => {
    const loadNearby = vi.fn();
    const getCurrentPosition = vi.fn((_resolve, reject) => reject({ code: 1 }));
    const wrapper = mountCard({ loadNearby, geolocation: { getCurrentPosition } });
    await flushPromises();

    await wrapper.findAll('.widget-actions button')
      .find((button) => button.text().includes('我的天气'))
      .trigger('click');
    await flushPromises();
    expect(loadNearby).not.toHaveBeenCalled();
    expect(wrapper.text()).toContain('没有获得定位授权');
    expect(wrapper.text()).toContain('杭州');
    wrapper.unmount();
  });

  it('returns quietly to site weather when a consented nearby request fails', async () => {
    const loadSite = vi.fn().mockResolvedValue(siteWeather);
    const loadNearby = vi.fn().mockRejectedValue(new Error('nearby unavailable'));
    const getCurrentPosition = vi.fn((resolve) => resolve({
      coords: { latitude: 30.25, longitude: 120.18 }
    }));
    const wrapper = mountCard({ loadSite, loadNearby, geolocation: { getCurrentPosition } });
    await flushPromises();

    await wrapper.findAll('.widget-actions button')
      .find((button) => button.text().includes('我的天气'))
      .trigger('click');
    await flushPromises();
    expect(loadNearby).toHaveBeenCalledOnce();
    expect(loadSite).toHaveBeenCalledTimes(2);
    expect(wrapper.text()).toContain('附近天气暂时不可用');
    expect(wrapper.text()).toContain('杭州');
    wrapper.unmount();
  });

  it('expands forecast and freshness details in place while keeping attribution and scroll', async () => {
    const scrollRoot = document.createElement('main');
    scrollRoot.className = 'route-content route-content-app-scroll';
    scrollRoot.scrollTop = 172;
    document.body.append(scrollRoot);
    const wrapper = mount(WeatherCard, {
      attachTo: scrollRoot,
      props: { loadSite: vi.fn().mockResolvedValue(siteWeather), loadNearby: vi.fn() }
    });
    await flushPromises();

    expect(wrapper.get('.widget-provenance a').text()).toContain('Open-Meteo');
    await wrapper.findAll('.widget-actions button')[0].trigger('click');
    await flushPromises();
    expect(wrapper.get('.widget-details').text()).toContain('观测时间');
    expect(wrapper.get('.forecast-list').text()).toContain('降水 20%');
    expect(scrollRoot.scrollTop).toBe(172);
    wrapper.unmount();
  });

  it('shows an honest unavailable state without zeroed readings or a guessed city', async () => {
    const wrapper = mountCard({
      loadSite: vi.fn().mockResolvedValue({
        available: false,
        freshness: 'unavailable',
        locationLabel: '',
        temperature: null,
        forecast: [],
        attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
      })
    });
    await flushPromises();

    expect(wrapper.text()).toContain('天气暂时不可用');
    expect(wrapper.text()).not.toContain('0°');
    expect(wrapper.find('.weather-primary').exists()).toBe(false);
    expect(wrapper.get('.widget-provenance a').text()).toContain('Open-Meteo');
    wrapper.unmount();
  });
});
