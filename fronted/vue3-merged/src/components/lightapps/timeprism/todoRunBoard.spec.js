import { mount } from '@vue/test-utils';
import { expect, it, vi } from 'vitest';
import TodoLocalNote from './TodoLocalNote.vue';
import { boardRows, noteUrl, returnMarkdown } from './todoRunBoard';

it('distinguishes skipped, running, failed, pending and completed using persisted UTC clocks', () => {
  const ctx = { stage: 'DESIGN', status:'IN_PROGRESS', events:[], stage_clocks:[
    { stage:'DESIGN', started_at:'2026-11-20T10:00:00', last_event_at:'2026-11-20T10:01:00' }
  ] };
  const now = Date.parse('2026-11-20T10:02:03Z');
  expect(boardRows(ctx, now).map(r => r.label)).toEqual(['跳过','运行中','未开始','未开始']);
  expect(boardRows(ctx, now)[1].elapsed).toBe('2 分 3 秒');
  expect(boardRows({...ctx,status:'FAILED'}, now)[1]).toMatchObject({label:'失败',elapsed:'1 分 0 秒'});
  const blocked = {...ctx,status:'BLOCKED', events:[
    {stage:'DESIGN',source:'MCP',event_type:'PROGRESS',summary:'[RUN_FAILED] local worker stopped'}]};
  expect(boardRows(blocked,now)[1].label).toBe('失败');
  expect(boardRows({...blocked,events:[]},now)[1].label).toBe('阻塞');
  expect(boardRows({...ctx,stage:'VERIFICATION',status:'COMPLETE'}, now).map(r => r.label)).toEqual(['跳过','完成','完成','完成']);
});

it('accepts a Chinese vault and relative file; rejects filesystem and command forms', () => {
  const url = noteUrl('obsidian://open?vault=工作&file=项目/交付.md');
  expect(new URL(url).searchParams.get('file')).toBe('项目/交付.md');
  for (const s of ['obsidian://advanced-uri?vault=work&file=x','obsidian://open?path=C:/a',
    'obsidian://open?vault=x&file=/etc/x','obsidian://open?vault=x&file=C%3A%5Ca',
    'obsidian://open?vault=x&file=%252e%252e/x','obsidian://open?vault=x&file=../x',
    'obsidian://open?vault=x&file=test&command=x','obsidian://open?vault=x&file=x&file=y']) expect(noteUrl(s)).toBe('');
});

it('adds, replaces, removes a local note, isolates owners and copies a Chinese return link', async () => {
  localStorage.clear();
  const writeText = vi.fn().mockResolvedValue(undefined);
  vi.stubGlobal('navigator', { clipboard:{writeText} });
  const w = mount(TodoLocalNote,{props:{accountId:'7',todoId:'31',title:'验收[中文]'}});
  try {
    expect(w.text()).toContain('这台设备还没有关联笔记');
    for (const file of ['初稿','定稿']) {
      await w.get('button').trigger('click');
      await w.get('input').setValue('obsidian://open?vault=工作&file=' + file);
      await w.get('form').trigger('submit');
      expect(new URL(w.get('a').attributes('href')).searchParams.get('file')).toBe(file);
    }
    await w.findAll('button').find(b => b.text().includes('Markdown')).trigger('click');
    expect(writeText).toHaveBeenCalledWith(returnMarkdown('验收[中文]','31',window.location));
    await w.setProps({accountId:'8'});
    expect(w.find('a').exists()).toBe(false);
    await w.setProps({accountId:'7'});
    await w.findAll('button').find(b => b.text() === '解除关联').trigger('click');
    expect(w.find('a').exists()).toBe(false);
  } finally { w.unmount(); vi.unstubAllGlobals(); }
});
