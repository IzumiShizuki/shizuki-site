[CmdletBinding()]
param(
  [Parameter(Mandatory = $true)]
  [ValidateSet('diagnose', 'attach', 'is-attached', 'get-icons', 'set-icons', 'foreground-fullscreen')]
  [string]$Operation,
  [string]$WindowHandle = '0',
  [int]$X = 0,
  [int]$Y = 0,
  [int]$Width = 0,
  [int]$Height = 0,
  [ValidateSet('true', 'false')]
  [string]$Visible = 'true'
)

$ErrorActionPreference = 'Stop'

if (-not ('Shizuki.DesktopShell' -as [type])) {
  Add-Type -TypeDefinition @'
using System;
using System.Runtime.InteropServices;

namespace Shizuki {
  public static class DesktopShell {
    public delegate bool EnumWindowsProc(IntPtr hWnd, IntPtr lParam);

    [StructLayout(LayoutKind.Sequential)]
    public struct RECT { public int Left; public int Top; public int Right; public int Bottom; }

    [StructLayout(LayoutKind.Sequential, CharSet = CharSet.Auto)]
    public struct MONITORINFO {
      public int cbSize;
      public RECT rcMonitor;
      public RECT rcWork;
      public int dwFlags;
    }

    [DllImport("user32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
    public static extern IntPtr FindWindow(string className, string windowName);

    [DllImport("user32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
    public static extern IntPtr FindWindowEx(IntPtr parent, IntPtr childAfter, string className, string windowName);

    [DllImport("user32.dll")]
    public static extern bool EnumWindows(EnumWindowsProc callback, IntPtr lParam);

    [DllImport("user32.dll", SetLastError = true)]
    public static extern IntPtr SetParent(IntPtr child, IntPtr newParent);

    [DllImport("user32.dll", SetLastError = true)]
    public static extern IntPtr GetParent(IntPtr child);

    [DllImport("user32.dll")]
    public static extern bool ShowWindow(IntPtr window, int command);

    [DllImport("user32.dll")]
    public static extern bool IsWindowVisible(IntPtr window);

    [DllImport("user32.dll", SetLastError = true)]
    public static extern bool SetWindowPos(IntPtr window, IntPtr insertAfter, int x, int y, int width, int height, uint flags);

    [DllImport("user32.dll", SetLastError = true)]
    public static extern IntPtr SendMessageTimeout(IntPtr window, uint message, IntPtr wParam, IntPtr lParam, uint flags, uint timeout, out IntPtr result);

    [DllImport("user32.dll")]
    public static extern IntPtr GetForegroundWindow();

    [DllImport("user32.dll")]
    public static extern bool GetWindowRect(IntPtr window, out RECT rect);

    [DllImport("user32.dll")]
    public static extern IntPtr MonitorFromWindow(IntPtr window, uint flags);

    [DllImport("user32.dll", CharSet = CharSet.Auto)]
    public static extern bool GetMonitorInfo(IntPtr monitor, ref MONITORINFO info);

    public static IntPtr FindDefViewTopWindow() {
      IntPtr found = IntPtr.Zero;
      EnumWindows((top, state) => {
        IntPtr view = FindWindowEx(top, IntPtr.Zero, "SHELLDLL_DefView", null);
        if (view != IntPtr.Zero) { found = top; return false; }
        return true;
      }, IntPtr.Zero);
      return found;
    }

    public static IntPtr FindDefView() {
      IntPtr top = FindDefViewTopWindow();
      return top == IntPtr.Zero ? IntPtr.Zero : FindWindowEx(top, IntPtr.Zero, "SHELLDLL_DefView", null);
    }

    public static IntPtr FindIconList() {
      IntPtr view = FindDefView();
      return view == IntPtr.Zero ? IntPtr.Zero : FindWindowEx(view, IntPtr.Zero, "SysListView32", "FolderView");
    }

    public static IntPtr FindWallpaperHost() {
      IntPtr progman = FindWindow("Progman", null);
      if (progman != IntPtr.Zero) {
        IntPtr ignored;
        SendMessageTimeout(progman, 0x052C, IntPtr.Zero, IntPtr.Zero, 0, 1000, out ignored);
      }
      IntPtr defViewTop = FindDefViewTopWindow();
      if (defViewTop != IntPtr.Zero) {
        IntPtr worker = FindWindowEx(IntPtr.Zero, defViewTop, "WorkerW", null);
        if (worker != IntPtr.Zero) return worker;
      }
      return progman;
    }

    public static bool IsForegroundFullscreen(out IntPtr foreground, out RECT windowRect, out RECT monitorRect) {
      foreground = GetForegroundWindow();
      windowRect = new RECT();
      monitorRect = new RECT();
      if (foreground == IntPtr.Zero || !GetWindowRect(foreground, out windowRect)) return false;
      IntPtr monitor = MonitorFromWindow(foreground, 2);
      if (monitor == IntPtr.Zero) return false;
      MONITORINFO info = new MONITORINFO();
      info.cbSize = Marshal.SizeOf(typeof(MONITORINFO));
      if (!GetMonitorInfo(monitor, ref info)) return false;
      monitorRect = info.rcMonitor;
      const int tolerance = 2;
      return Math.Abs(windowRect.Left - monitorRect.Left) <= tolerance
        && Math.Abs(windowRect.Top - monitorRect.Top) <= tolerance
        && Math.Abs(windowRect.Right - monitorRect.Right) <= tolerance
        && Math.Abs(windowRect.Bottom - monitorRect.Bottom) <= tolerance;
    }
  }
}
'@
}

function Convert-ToHandle([string]$raw) {
  $value = 0L
  if (-not [long]::TryParse($raw, [ref]$value) -or $value -le 0) {
    throw "WindowHandle must be a positive decimal integer."
  }
  return [IntPtr]::new($value)
}

function Convert-Rect($rect) {
  return [ordered]@{
    x = $rect.Left
    y = $rect.Top
    width = $rect.Right - $rect.Left
    height = $rect.Bottom - $rect.Top
  }
}

try {
  $progman = [Shizuki.DesktopShell]::FindWindow('Progman', $null)
  $defView = [Shizuki.DesktopShell]::FindDefView()
  $iconList = [Shizuki.DesktopShell]::FindIconList()
  $wallpaperHost = [Shizuki.DesktopShell]::FindWallpaperHost()

  switch ($Operation) {
    'diagnose' {
      $result = [ordered]@{
        ok = $true
        operation = $Operation
        progman = $progman.ToInt64().ToString()
        defView = $defView.ToInt64().ToString()
        iconList = $iconList.ToInt64().ToString()
        wallpaperHost = $wallpaperHost.ToInt64().ToString()
        iconsVisible = if ($iconList -eq [IntPtr]::Zero) { $null } else { [Shizuki.DesktopShell]::IsWindowVisible($iconList) }
        available = $wallpaperHost -ne [IntPtr]::Zero -and $defView -ne [IntPtr]::Zero
      }
    }
    'attach' {
      if ($wallpaperHost -eq [IntPtr]::Zero) { throw 'Windows wallpaper host was not found.' }
      if ($Width -le 0 -or $Height -le 0) { throw 'Attach bounds must be positive.' }
      $child = Convert-ToHandle $WindowHandle
      [void][Shizuki.DesktopShell]::SetParent($child, $wallpaperHost)
      $positioned = [Shizuki.DesktopShell]::SetWindowPos($child, [IntPtr]::Zero, $X, $Y, $Width, $Height, 0x0040)
      $attached = [Shizuki.DesktopShell]::GetParent($child) -eq $wallpaperHost
      $result = [ordered]@{
        ok = $attached -and $positioned
        operation = $Operation
        attached = $attached
        positioned = $positioned
        wallpaperHost = $wallpaperHost.ToInt64().ToString()
      }
    }
    'is-attached' {
      $child = Convert-ToHandle $WindowHandle
      $result = [ordered]@{
        ok = $true
        operation = $Operation
        attached = $wallpaperHost -ne [IntPtr]::Zero -and [Shizuki.DesktopShell]::GetParent($child) -eq $wallpaperHost
        wallpaperHost = $wallpaperHost.ToInt64().ToString()
      }
    }
    'get-icons' {
      if ($iconList -eq [IntPtr]::Zero) { throw 'Explorer desktop icon view was not found.' }
      $result = [ordered]@{
        ok = $true
        operation = $Operation
        visible = [Shizuki.DesktopShell]::IsWindowVisible($iconList)
      }
    }
    'set-icons' {
      if ($iconList -eq [IntPtr]::Zero) { throw 'Explorer desktop icon view was not found.' }
      $desired = $Visible -eq 'true'
      [void][Shizuki.DesktopShell]::ShowWindow($iconList, $(if ($desired) { 5 } else { 0 }))
      $actual = [Shizuki.DesktopShell]::IsWindowVisible($iconList)
      $result = [ordered]@{
        ok = $actual -eq $desired
        operation = $Operation
        visible = $actual
      }
    }
    'foreground-fullscreen' {
      $foreground = [IntPtr]::Zero
      $windowRect = New-Object Shizuki.DesktopShell+RECT
      $monitorRect = New-Object Shizuki.DesktopShell+RECT
      $fullscreen = [Shizuki.DesktopShell]::IsForegroundFullscreen([ref]$foreground, [ref]$windowRect, [ref]$monitorRect)
      $shellWindow = $foreground -eq $progman -or $foreground -eq $defView -or $foreground -eq $wallpaperHost
      $result = [ordered]@{
        ok = $true
        operation = $Operation
        fullscreen = $fullscreen -and -not $shellWindow
        foreground = $foreground.ToInt64().ToString()
        windowRect = Convert-Rect $windowRect
        monitorRect = Convert-Rect $monitorRect
      }
    }
  }
  $result | ConvertTo-Json -Compress -Depth 5
} catch {
  [ordered]@{
    ok = $false
    operation = $Operation
    error = $_.Exception.Message
  } | ConvertTo-Json -Compress
  exit 1
}
