/**
 * @license Apache-2.0
 * 来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
 * 作者: Px-asen (Pxasen.com)
 * 原路径: src/renderer/src/components/audioVisualizerFormatting.ts
 * 移植说明: 逐字移植（纯格式化函数，输入为轨道元数据）。
 */

export function formatVisualizerBitrateValue(bitrate?: number): number | null {
  if (typeof bitrate !== 'number' || !Number.isFinite(bitrate) || bitrate <= 0) return null
  return Math.round(bitrate >= 10000 ? bitrate / 1000 : bitrate)
}

export function formatVisualizerBitrate(bitrate?: number): string {
  const value = formatVisualizerBitrateValue(bitrate)
  return value === null ? '' : `${value} kbps`
}

export function buildVisualizerQualityString(track: {
  format?: string
  sampleRate?: number
  bitrate?: number
  bitDepth?: number
}): string {
  const parts: string[] = []
  const bitrate = formatVisualizerBitrateValue(track.bitrate)
  if (track.format) parts.push(track.format.toUpperCase())
  if (track.bitDepth) parts.push(`${track.bitDepth}-bit`)
  if (track.sampleRate) parts.push(`${(track.sampleRate / 1000).toFixed(1)}kHz`)
  if (bitrate !== null) parts.push(`${bitrate}kbps`)
  return parts.join(' / ')
}
