import { useAsyncResource } from './useAsyncResource';
import {
  getNearbyWeather,
  getQuoteAlternative,
  getSiteWeather,
  getTodayQuote
} from '../services/siteWidgetsApi';

export function useSiteWeatherResource({
  immediate = true,
  loadSite = getSiteWeather,
  loadNearby = getNearbyWeather
} = {}) {
  let request = { scope: 'site' };
  const resource = useAsyncResource(
    ({ signal }) => request.scope === 'nearby'
      ? loadNearby({ ...request.coordinates, consent: true, signal })
      : loadSite(signal),
    { immediate, isEmpty: (value) => !value?.available }
  );

  function showSiteWeather() {
    request = { scope: 'site' };
    return resource.refresh('site-weather');
  }

  function requestNearbyWeather({ latitude, longitude, consent } = {}) {
    if (consent !== true) {
      return Promise.reject(new TypeError('Explicit geolocation consent is required'));
    }
    request = { scope: 'nearby', coordinates: { latitude, longitude } };
    return resource.refresh('nearby-weather');
  }

  return Object.freeze({ ...resource, showSiteWeather, requestNearbyWeather });
}
export function useDailyQuoteResource({
  immediate = true,
  loadToday = getTodayQuote,
  loadAlternative = getQuoteAlternative
} = {}) {
  let request = { mode: 'today', afterQuoteId: null };
  const resource = useAsyncResource(
    ({ signal }) => request.mode === 'alternative'
      ? loadAlternative(request.afterQuoteId, signal)
      : loadToday(signal),
    { immediate, isEmpty: (value) => !value?.available }
  );

  function showToday() {
    request = { mode: 'today', afterQuoteId: null };
    return resource.refresh('today');
  }

  function showLocalAlternative(afterQuoteId = resource.data.value?.localQuoteId) {
    request = { mode: 'alternative', afterQuoteId };
    return resource.refresh('local-alternative');
  }

  return Object.freeze({ ...resource, showToday, showLocalAlternative });
}
