(function installMusicSourceBridge() {
  const CHANNEL = 'shizuki.music.source.helper';

  window.addEventListener('message', (event) => {
    if (event.source !== window) {
      return;
    }
    const data = event.data;
    if (!data || data.channel !== CHANNEL || data.direction !== 'page->helper') {
      return;
    }
    const requestId = String(data.requestId || '').trim();
    if (!requestId) {
      return;
    }
    chrome.runtime.sendMessage(
      {
        type: String(data.type || '').trim().toUpperCase(),
        payload: data.payload || {}
      },
      (response) => {
        const runtimeError = chrome.runtime.lastError;
        if (runtimeError) {
          window.postMessage(
            {
              channel: CHANNEL,
              direction: 'helper->page',
              requestId,
              ok: false,
              error: runtimeError.message || '音乐助手不可用'
            },
            window.location.origin
          );
          return;
        }
        if (!response) {
          window.postMessage(
            {
              channel: CHANNEL,
              direction: 'helper->page',
              requestId,
              ok: false,
              error: '音乐助手未返回结果'
            },
            window.location.origin
          );
          return;
        }
        window.postMessage(
          {
            channel: CHANNEL,
            direction: 'helper->page',
            requestId,
            ok: response.ok !== false,
            payload: response.payload || response,
            error: response.error || ''
          },
          window.location.origin
        );
      }
    );
  });
})();
