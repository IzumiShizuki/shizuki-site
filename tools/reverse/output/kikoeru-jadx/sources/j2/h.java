package j2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9820a;

    public h(i iVar) {
        this.f9820a = iVar;
    }

    public final void a(f1 f1Var) {
        ClipboardManager clipboardManager = this.f9820a.f9825a;
        if (f1Var != null) {
            clipboardManager.setPrimaryClip(f1Var.f9813a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
