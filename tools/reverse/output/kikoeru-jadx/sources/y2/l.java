package y2;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.f0 f25417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0.r f25418b;

    public l(j0.r rVar, a0.f0 f0Var) {
        this.f25417a = f0Var;
        this.f25418b = rVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            if (rVar != null) {
                a(rVar);
                this.f25418b = null;
            }
            this.f25417a.a(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        j0.r rVar = this.f25418b;
        if (rVar != null) {
            return rVar.setSelection(i10, i11);
        }
        return false;
    }

    public void a(j0.r rVar) {
    }
}
