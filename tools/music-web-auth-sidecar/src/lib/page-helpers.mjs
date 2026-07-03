function resolveRoots(root) {
  if (!root) {
    return [];
  }
  if (typeof root.frames === 'function') {
    return root.frames();
  }
  return [root];
}

export async function findVisibleLocator(root, selectors) {
  const contexts = resolveRoots(root);
  for (const context of contexts) {
    for (const selector of selectors) {
      const locator = context.locator(selector).first();
      const count = await locator.count().catch(() => 0);
      if (!count) {
        continue;
      }
      const visible = await locator.isVisible().catch(() => false);
      if (visible) {
        return locator;
      }
    }
  }
  return null;
}

export async function readTextOfFirstVisible(root, selectors) {
  const locator = await findVisibleLocator(root, selectors);
  if (!locator) {
    return '';
  }
  return String(await locator.innerText().catch(() => '')).trim();
}

export async function readAttributeOfFirstVisible(root, selectors, attributeName) {
  const locator = await findVisibleLocator(root, selectors);
  if (!locator) {
    return '';
  }
  return String(await locator.getAttribute(attributeName).catch(() => '') || '').trim();
}

export async function extractImageDataUrl(root, selectors) {
  const locator = await findVisibleLocator(root, selectors);
  if (!locator) {
    return '';
  }
  const screenshot = await locator.screenshot({ type: 'png' }).catch(() => null);
  if (!screenshot) {
    return '';
  }
  return `data:image/png;base64,${Buffer.from(screenshot).toString('base64')}`;
}
