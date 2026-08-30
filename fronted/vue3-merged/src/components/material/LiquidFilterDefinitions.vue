<template>
  <svg
    class="liquid-filter-definitions"
    width="0"
    height="0"
    aria-hidden="true"
    focusable="false"
    data-testid="liquid-filter-definitions"
  >
    <defs>
      <filter
        :id="LIQUID_FILTER_IDS.surface"
        x="-8%"
        y="-12%"
        width="116%"
        height="124%"
        color-interpolation-filters="sRGB"
      >
        <feTurbulence
          type="fractalNoise"
          baseFrequency="0.012 0.036"
          numOctaves="2"
          seed="17"
          result="surface-noise"
        />
        <feGaussianBlur in="surface-noise" stdDeviation="0.42" result="surface-soft-noise" />
        <feDisplacementMap
          in="SourceGraphic"
          in2="surface-soft-noise"
          scale="5"
          xChannelSelector="R"
          yChannelSelector="B"
        />
      </filter>

      <filter
        :id="LIQUID_FILTER_IDS.lens"
        x="-14%"
        y="-18%"
        width="128%"
        height="136%"
        color-interpolation-filters="sRGB"
      >
        <feTurbulence
          type="turbulence"
          baseFrequency="0.009 0.024"
          numOctaves="2"
          seed="29"
          result="lens-noise"
        />
        <feGaussianBlur in="lens-noise" stdDeviation="0.6" result="lens-soft-noise" />
        <feDisplacementMap
          in="SourceGraphic"
          in2="lens-soft-noise"
          scale="9"
          xChannelSelector="R"
          yChannelSelector="G"
        />
      </filter>
    </defs>
  </svg>
</template>

<script setup>
import { LIQUID_FILTER_IDS } from './liquidFilterIds';
</script>
