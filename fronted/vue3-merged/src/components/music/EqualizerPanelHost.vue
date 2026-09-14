<!--
  @file EqualizerPanelHost.vue
  站点均衡器面板最小接入点骨架（shizuki-site 新建）。
  包裹移植自 Twilight_Echo 的 GraphicEqPanel（dB 域 props/emits），
  桥接到 musicLibraryUiState.eqBands10（0..1 电平域）：
  - bands：eqBands10 → EqualizerBand[]（图形 10 段、±12 dB）；
  - preview-band：面板 dB → 电平写回 ui.setEqBand10（App.vue watch 实时应用音频链）；
  - preamp / commit / advanced：暂为占位，完整设置面板 UI 后续再做。
-->
<script setup>
import { computed } from 'vue';
import GraphicEqPanel from './equalizer/GraphicEqPanel.vue';
import { useMusicLibraryUiState } from '../../pages/musicLibraryUiState';
import {
  bands10LevelsToEqualizerBands,
  gainDbToLevel
} from '../../utils/audioEngine/eqBands10Mapping';

const ui = useMusicLibraryUiState();

const bands = computed(() => bands10LevelsToEqualizerBands(ui.eqBands10.value));

function handlePreviewPreamp(preampDb) {
  // 站点状态暂无 preamp 字段：完整设置面板接入时再落地。
  void preampDb;
}

function handlePreviewBand(index, patch) {
  if (patch && Number.isFinite(Number(patch.gain))) {
    ui.setEqBand10(index, gainDbToLevel(Number(patch.gain)));
  }
}

function handleCommit() {
  // 拖拽结束：未来在此做持久化 / 事件派发。
}

function handleAdvanced(index) {
  // 单段高级设置：完整设置面板接入时再落地。
  void index;
}
</script>

<template>
  <GraphicEqPanel
    :preamp="0"
    :bands="bands"
    :auto-preamp-enabled="false"
    @preview-preamp="handlePreviewPreamp"
    @preview-band="handlePreviewBand"
    @commit="handleCommit"
    @advanced="handleAdvanced"
  />
</template>
