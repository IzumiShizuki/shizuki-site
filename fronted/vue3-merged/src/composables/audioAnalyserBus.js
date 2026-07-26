import { inject } from 'vue';

/**
 * 全局音频分析总线:App.vue 建立 AudioContext / EQ / AnalyserNode 后 provide,
 * 任意路由下的可视化组件按需 inject。
 * 形如:{ ensure(): void, getAnalyser(): AnalyserNode | null }
 * - ensure:惰性创建分析链路并尝试 resume(需在用户手势语境下调用效果最佳)。
 * - getAnalyser:返回当前 AnalyserNode,不存在时为 null。
 */
export const AUDIO_ANALYSER_BUS_KEY = Symbol('shizuki.audioAnalyserBus');

export function useAudioAnalyserBus() {
  return inject(AUDIO_ANALYSER_BUS_KEY, null);
}
