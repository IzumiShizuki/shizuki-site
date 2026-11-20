<template>
  <section aria-label="阶段看板" class="run-board">
    <h4>阶段看板</h4>
    <ol>
      <li v-for="row in rows" :key="row.key" :data-status="row.status" :aria-current="row.current ? 'step' : undefined">
        <div><strong>{{ row.title }}</strong><span class="state">{{ row.label }}</span></div>
        <small>{{ row.role }} · {{ row.elapsed }}</small>
        <a v-for="(asset, i) in row.assets" :key="i" :href="asset.url" target="_blank" rel="noopener noreferrer">{{ row.title }}产物{{ row.assets.length > 1 ? i + 1 : '' }} ↗</a>
      </li>
    </ol>
  </section>
</template>
<script setup>
import { computed, onMounted, onBeforeUnmount, ref } from 'vue';
import { boardRows } from './todoRunBoard';
const props = defineProps({ context: { type: Object, required: true } });
const now = ref(Date.now());
const rows = computed(() => boardRows(props.context, now.value));
let timer;
onMounted(() => { timer = setInterval(() => { now.value = Date.now(); }, 1000); });
onBeforeUnmount(() => clearInterval(timer));
</script>
<style scoped>
.run-board h4 { font-size: 1rem; margin: 0 0 .7rem; }
ol { display:grid; grid-template-columns: repeat(auto-fit,minmax(min(135px,100%),1fr)); gap:8px; list-style:none; margin:0; padding:0; }
li { display:grid; align-content:start; gap:7px; border:1px solid var(--la-border,#cbd5e1); border-radius:10px; padding:10px; }
li[aria-current] { border-color:var(--la-primary,#6884ac); box-shadow:inset 0 2px var(--la-primary,#6884ac); }
li > div { display:flex; justify-content:space-between; gap:4px; align-items:center; }
.state,small { font-size:.78rem; }
[data-status="COMPLETE"] .state { color:var(--la-success,#33815c); }
[data-status="FAILED"] .state { color:var(--la-danger,#bf495b); }
a { overflow-wrap:anywhere; }
</style>
