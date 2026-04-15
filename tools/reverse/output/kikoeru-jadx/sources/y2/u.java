package y2;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.h f25420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f25423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25426g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25427h = true;

    public u(y yVar, xa.h hVar, boolean z10) {
        this.f25420a = hVar;
        this.f25421b = z10;
        this.f25423d = yVar;
    }

    public final void a(g gVar) {
        this.f25422c++;
        try {
            this.f25426g.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ic.k, jc.m] */
    public final boolean b() {
        int i10 = this.f25422c - 1;
        this.f25422c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f25426g;
            if (!arrayList.isEmpty()) {
                ((b0) this.f25420a.f24888a).f25371e.a(vb.m.H0(arrayList));
                arrayList.clear();
            }
        }
        return this.f25422c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        this.f25422c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f25427h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f25426g.clear();
        this.f25422c = 0;
        this.f25427h = false;
        ArrayList arrayList = ((b0) this.f25420a.f24888a).f25375i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jc.l.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f25427h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f25427h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f25427h;
        return z10 ? this.f25421b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f25427h;
        if (z10) {
            a(new a(i10, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        a(new e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        a(new f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        a(new h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        y yVar = this.f25423d;
        return TextUtils.getCapsMode(yVar.f25434a.f20320b, k0.e(yVar.f25435b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f25425f = z10;
        if (z10) {
            this.f25424e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ud.b.I(this.f25423d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (k0.b(this.f25423d.f25435b)) {
            return null;
        }
        return ud.e.z(this.f25423d).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return ud.e.A(this.f25423d, i10).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return ud.e.B(this.f25423d, i10).f20320b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f25427h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new x(0, this.f25423d.f25434a.f20320b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f25427h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
                ((b0) this.f25420a.f24888a).f25372f.a(new i(i11));
            } else {
                i11 = 1;
                ((b0) this.f25420a.f24888a).f25372f.a(new i(i11));
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f25427h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f25427h
            if (r0 == 0) goto L75
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4c
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = 1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = 1
        L38:
            if (r5 != 0) goto L49
            if (r6 != 0) goto L49
            if (r7 != 0) goto L49
            if (r1 != 0) goto L49
            if (r4 < r8) goto L47
            r10 = 1
        L43:
            r1 = 1
        L44:
            r5 = 1
            r6 = 1
            goto L4e
        L47:
            r10 = r1
            goto L43
        L49:
            r10 = r1
            r1 = r7
            goto L4e
        L4c:
            r10 = 0
            goto L44
        L4e:
            xa.h r4 = r9.f25420a
            java.lang.Object r4 = r4.f24888a
            y2.b0 r4 = (y2.b0) r4
            y2.c r4 = r4.f25378l
            java.lang.Object r7 = r4.f25383c
            monitor-enter(r7)
            r4.f25386f = r5     // Catch: java.lang.Throwable -> L6d
            r4.f25387g = r6     // Catch: java.lang.Throwable -> L6d
            r4.f25388h = r1     // Catch: java.lang.Throwable -> L6d
            r4.f25389i = r10     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            r4.f25385e = r2     // Catch: java.lang.Throwable -> L6d
            y2.y r10 = r4.f25390j     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto L73
        L6f:
            r4.f25384d = r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r2
        L73:
            monitor-exit(r7)
            throw r10
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.u.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ub.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((b0) this.f25420a.f24888a).f25376j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f25427h;
        if (z10) {
            a(new v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f25427h;
        if (z10) {
            a(new w(i10, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f25427h;
        if (!z10) {
            return z10;
        }
        a(new x(i10, i11));
        return true;
    }
}
