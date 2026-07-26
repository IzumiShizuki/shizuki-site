import { inject } from 'vue';

export const MOBILE_SHELL_CONTEXT_KEY = Symbol('shizuki.mobileShellContext');

export function useMobileShell() {
  const context = inject(MOBILE_SHELL_CONTEXT_KEY, null);
  if (!context) {
    throw new Error('Mobile shell context is not provided in current route.');
  }
  return context;
}
