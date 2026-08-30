export const RouteScrollMode = Object.freeze({
  APP: 'app',
  WORKSPACE: 'workspace'
});

const AUTHOR_ADMIN_ROUTE_PREFIX = 'admin:';

export function resolveRouteScrollMode(route) {
  if (
    route?.name === 'author'
    && String(route?.query?.tab || '').trim().toLowerCase().startsWith(AUTHOR_ADMIN_ROUTE_PREFIX)
  ) {
    return RouteScrollMode.WORKSPACE;
  }

  return route?.meta?.scrollMode === RouteScrollMode.APP
    ? RouteScrollMode.APP
    : RouteScrollMode.WORKSPACE;
}
