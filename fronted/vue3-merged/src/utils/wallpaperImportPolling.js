const TERMINAL_IMPORT_STATUSES = new Set(['SUCCEEDED', 'FAILED', 'FALLBACK_REQUIRED']);

function normalizeJobId(value) {
  const jobId = Number(value || 0);
  return Number.isFinite(jobId) && jobId > 0 ? jobId : 0;
}

export function isWallpaperImportTerminalStatus(status) {
  return TERMINAL_IMPORT_STATUSES.has(String(status || '').trim().toUpperCase());
}

export function createWallpaperImportPoller({
  fetchJob,
  onJob,
  onError = () => {},
  intervalMs = 1600,
  schedule = (callback, delay) => setTimeout(callback, delay),
  cancel = (timerId) => clearTimeout(timerId)
}) {
  let timerId = null;
  let currentJobId = 0;
  let generation = 0;

  function clearScheduledPoll() {
    if (timerId === null) return;
    cancel(timerId);
    timerId = null;
  }

  function stop() {
    clearScheduledPoll();
    generation += 1;
    currentJobId = 0;
  }

  function queue(runGeneration) {
    timerId = schedule(() => {
      timerId = null;
      return poll(runGeneration);
    }, Math.max(250, Number(intervalMs) || 1600));
  }

  async function poll(runGeneration) {
    if (runGeneration !== generation || !currentJobId) return null;
    const requestedJobId = currentJobId;
    try {
      const job = await fetchJob(requestedJobId);
      if (runGeneration !== generation || requestedJobId !== currentJobId) return job;
      await onJob(job);
      if (isWallpaperImportTerminalStatus(job?.status)) {
        generation += 1;
        currentJobId = 0;
        return job;
      }
    } catch (error) {
      if (runGeneration !== generation || requestedJobId !== currentJobId) return null;
      onError(error);
    }
    if (runGeneration === generation && currentJobId) queue(runGeneration);
    return null;
  }

  function start(jobId) {
    const normalizedJobId = normalizeJobId(jobId);
    clearScheduledPoll();
    generation += 1;
    currentJobId = normalizedJobId;
    if (!currentJobId) return;
    queue(generation);
  }

  return {
    start,
    stop,
    isActive: () => Boolean(currentJobId),
    activeJobId: () => currentJobId
  };
}
