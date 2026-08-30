<template>
  <div
    class="content-shell"
    :class="{
      'content-shell--without-left': !$slots.left,
      'content-shell--without-right': !$slots.right
    }"
    data-content-layout="responsive"
  >
    <aside v-if="$slots.left" class="content-shell__left" aria-label="页面导航与背景信息">
      <slot name="left" />
    </aside>

    <main class="content-shell__main">
      <slot />
    </main>

    <aside v-if="$slots.right" class="content-shell__right" aria-label="生活辅助信息">
      <slot name="right" />
    </aside>

    <div v-if="$slots['auxiliary-trigger']" class="content-shell__auxiliary-trigger">
      <slot name="auxiliary-trigger" />
    </div>
  </div>
</template>

<style scoped>
.content-shell {
  --content-shell-gap: clamp(18px, 2vw, 30px);
  --content-shell-left: clamp(240px, 19vw, 270px);
  --content-shell-right: clamp(280px, 22vw, 320px);
  display: grid;
  grid-template-columns: var(--content-shell-left) minmax(0, 1fr) var(--content-shell-right);
  align-items: start;
  gap: var(--content-shell-gap);
  width: min(100%, var(--app-workspace-content-max-width, 1320px));
  min-width: 0;
  margin-inline: auto;
}

.content-shell__left,
.content-shell__main,
.content-shell__right {
  min-width: 0;
}

.content-shell__auxiliary-trigger {
  display: none;
}

@media (min-width: 1200px) {
  .content-shell.content-shell--without-left {
    grid-template-columns: minmax(0, 1fr) var(--content-shell-right);
  }

  .content-shell.content-shell--without-right {
    grid-template-columns: var(--content-shell-left) minmax(0, 1fr);
  }

  .content-shell.content-shell--without-left.content-shell--without-right {
    grid-template-columns: minmax(0, 1fr);
  }
}

@media (min-width: 900px) and (max-width: 1199.98px) {
  .content-shell {
    --content-shell-left: clamp(220px, 25vw, 250px);
    grid-template-columns: var(--content-shell-left) minmax(0, 1fr);
  }

  .content-shell__left {
    grid-column: 1;
    grid-row: 1 / span 2;
  }

  .content-shell__main,
  .content-shell__right {
    grid-column: 2;
  }

  .content-shell__right {
    grid-row: 2;
  }

  .content-shell__auxiliary-trigger {
    display: block;
    grid-column: 2;
  }

  .content-shell.content-shell--without-left {
    grid-template-columns: minmax(0, 1fr) var(--content-shell-right);
  }

  .content-shell--without-left .content-shell__main {
    grid-column: 1;
  }

  .content-shell--without-left .content-shell__right {
    grid-column: 2;
    grid-row: 1;
  }

  .content-shell.content-shell--without-left.content-shell--without-right {
    grid-template-columns: minmax(0, 1fr);
  }

  .content-shell--without-left.content-shell--without-right .content-shell__main,
  .content-shell--without-left.content-shell--without-right .content-shell__auxiliary-trigger {
    grid-column: 1;
  }
}

@media (max-width: 899.98px) {
  .content-shell {
    display: block;
    width: 100%;
  }

  .content-shell__left,
  .content-shell__right {
    display: none;
  }

  .content-shell__auxiliary-trigger {
    display: block;
    position: sticky;
    z-index: 20;
    bottom: max(14px, env(safe-area-inset-bottom));
    width: max-content;
    max-width: 100%;
    margin: 18px auto 0;
  }
}
</style>
