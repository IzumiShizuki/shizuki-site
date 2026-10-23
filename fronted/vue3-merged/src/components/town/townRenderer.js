import { TILE, tileIndex, isWalkable } from './townMap';

// The extra scenery is native pixel art, drawn on the same 16 px grid as the atlas.
export function drawTile(ctx, atlas, id, x, y, size, tick = 0) {
  if (id < 0) return;
  if (id < 132 && atlas?.complete && atlas.naturalWidth) {
    ctx.drawImage(atlas, (id % 12) * 16, Math.floor(id / 12) * 16, 16, 16, x, y, size, size);
    return;
  }
  ctx.save(); ctx.translate(x, y); ctx.scale(size / 16, size / 16);
  const box = (color, xx, yy, w, h) => { ctx.fillStyle = color; ctx.fillRect(xx, yy, w, h); };
  if (id === TILE.WATER) {
    box('#568f9c', 0, 0, 16, 16); box('#75abb2', (tick % 3) + 2, 4, 6, 1); box('#87b8bc', 7 - (tick % 3), 11, 5, 1);
  } else if (id === TILE.BRIDGE) {
    box('#665244', 0, 0, 16, 16); for (let row = 0; row < 16; row += 4) { box('#ba9667', 0, row, 16, 3); box('#d3b580', 1, row, 14, 1); }
    box('#56433b', 0, 0, 2, 16); box('#56433b', 14, 0, 2, 16);
  } else if (id === TILE.CROSS) {
    box('#493d42', 7, 1, 3, 15); box('#493d42', 3, 5, 11, 3); box('#e8d7a1', 7, 1, 2, 14); box('#e8d7a1', 3, 5, 10, 2);
  } else if (id === TILE.FOUNTAIN) {
    box('#526572', 1, 5, 14, 9); box('#9da9a0', 0, 5, 16, 5); box('#689faf', 2, 5, 12, 4); box('#d4d6bb', 6, 0, 4, 9); box('#edf0d3', 4, 0, 8, 2); box('#b2e0da', 5, 3, 2, 4);
  } else if (id === TILE.LAMP) {
    box('#49434b', 7, 5, 2, 11); box('#49434b', 4, 1, 8, 6); box('#efcc87', 5, 2, 6, 4); box('#fff1ba', 7, 2, 2, 3); box('#49434b', 5, 15, 6, 1);
  } else {
    // Asset load failure still leaves an operable, visibly distinct map.
    box(id < 3 ? '#86b96b' : id === 43 ? '#b8baa5' : '#b6946e', 0, 0, 16, 16);
    if (id >= 48) box('#66576a', 1, 1, 14, 14);
  }
  ctx.restore();
}

export function drawActor(ctx, x, y, size, color = 'blue', direction = 'down', step = 0) {
  ctx.save(); ctx.translate(x, y); ctx.scale(size / 16, size / 16);
  const rect = (c, xx, yy, w, h) => { ctx.fillStyle = c; ctx.fillRect(xx, yy, w, h); };
  const shirt = { blue: '#587f9a', rose: '#ae6674', gold: '#ba8d4d', green: '#5c8976' }[color];
  ctx.fillStyle = 'rgba(40, 47, 42, .22)'; ctx.beginPath(); ctx.ellipse(8, 14, 5, 2, 0, 0, Math.PI * 2); ctx.fill();
  rect('#3e3541', 5, 11, 3, 3 + step); rect('#3e3541', 9, 11, 3, 4 - step);
  rect('#3e3541', 3, 6, 11, 7); rect(shirt, 4, 7, 9, 5); rect('#e8b78b', 3, 8, 2, 3); rect('#e8b78b', 12, 8, 2, 3);
  rect('#493a40', 4, 0, 9, 8); rect('#efc89b', 5, 3, 7, 5); rect('#6b4d45', 5, 0, 7, 3); rect('#6b4d45', 4, 2, 2, 3);
  if (direction !== 'up') { rect('#3e3541', direction === 'left' ? 5 : 7, 4, 1, 1); rect('#3e3541', direction === 'right' ? 11 : 10, 4, 1, 1); }
  else rect('#6b4d45', 5, 2, 7, 5);
  ctx.restore();
}

export function drawTown(ctx, { map, atlas, width, height, scale, camera, player, editing, grid, collision, hover, selectedEvent, route, tick }) {
  const size = 16 * scale;
  ctx.clearRect(0, 0, width, height);
  ctx.fillStyle = '#344c42'; ctx.fillRect(0, 0, width, height);
  ctx.save(); ctx.translate(-camera.x, -camera.y); ctx.imageSmoothingEnabled = false;
  const minX = Math.max(0, Math.floor(camera.x / size)), maxX = Math.min(map.width, Math.ceil((camera.x + width) / size));
  const minY = Math.max(0, Math.floor(camera.y / size)), maxY = Math.min(map.height, Math.ceil((camera.y + height) / size));
  for (let y = minY; y < maxY; y++) for (let x = minX; x < maxX; x++) {
    const i = tileIndex(map, x, y);
    drawTile(ctx, atlas, map.ground[i], x * size, y * size, size, tick);
    drawTile(ctx, atlas, map.objects[i], x * size, y * size, size, tick);
    if (editing && collision) { ctx.fillStyle = isWalkable(map, x, y) ? 'rgba(59, 184, 128, .25)' : 'rgba(203, 70, 86, .5)'; ctx.fillRect(x * size, y * size, size, size); }
  }
  for (const p of route) { ctx.fillStyle = '#f8efc4'; ctx.fillRect((p.x + .4) * size, (p.y + .4) * size, size * .2, size * .2); }
  for (const e of map.events) {
    const x = e.x * size, y = e.y * size;
    if (e.kind === 'npc') drawActor(ctx, x, y, size, e.color);
    else if (e.kind === 'sign') { ctx.fillStyle = '#68503f'; ctx.fillRect(x + size * .45, y + size * .4, size * .1, size * .5); ctx.fillStyle = '#cfac72'; ctx.fillRect(x + size * .15, y + size * .15, size * .7, size * .4); }
    if (editing || e.kind === 'door') {
      ctx.font = `${Math.max(10, Math.min(12, size * .4))}px sans-serif`; ctx.textAlign = 'center';
      const textWidth = ctx.measureText(e.title).width + 12;
      ctx.fillStyle = '#35433de8'; ctx.fillRect(x + size / 2 - textWidth / 2, y - 17, textWidth, 16);
      ctx.fillStyle = '#fff5d7'; ctx.fillText(e.title, x + size / 2, y - 5);
    }
    if (selectedEvent === e.id) { ctx.strokeStyle = '#fff1b8'; ctx.lineWidth = 2; ctx.strokeRect(x + 1, y + 1, size - 2, size - 2); }
  }
  if (editing) {
    ctx.fillStyle = '#fff2b0'; ctx.font = `bold ${Math.max(12, size * .6)}px sans-serif`; ctx.textAlign = 'center'; ctx.fillText('⚑', (map.spawn.x + .5) * size, (map.spawn.y + .8) * size);
  } else {
    drawActor(ctx, player.x * size, player.y * size, size, 'blue', player.direction, player.step);
    const center = (player.x + .5) * size, top = player.y * size - 3;
    ctx.fillStyle = '#ffe6a0'; ctx.strokeStyle = '#51493a'; ctx.lineWidth = 1;
    ctx.beginPath(); ctx.moveTo(center - 5, top - 7); ctx.lineTo(center + 5, top - 7); ctx.lineTo(center, top); ctx.closePath(); ctx.fill(); ctx.stroke();
  }
  if (editing && grid) {
    ctx.strokeStyle = 'rgba(38, 56, 45, .22)'; ctx.lineWidth = 1; ctx.beginPath();
    for (let x = minX; x <= maxX; x++) { ctx.moveTo(x * size, minY * size); ctx.lineTo(x * size, maxY * size); }
    for (let y = minY; y <= maxY; y++) { ctx.moveTo(minX * size, y * size); ctx.lineTo(maxX * size, y * size); }
    ctx.stroke();
  }
  if (editing && hover) { ctx.strokeStyle = '#fff6d0'; ctx.lineWidth = 2; ctx.strokeRect(hover.x * size + 1, hover.y * size + 1, size - 2, size - 2); }
  ctx.restore();
}
