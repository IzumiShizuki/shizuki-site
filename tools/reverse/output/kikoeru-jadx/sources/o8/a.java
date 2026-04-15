package o8;

import java.io.File;
import s8.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16283a;

    public a(boolean z10) {
        this.f16283a = z10;
    }

    @Override // o8.b
    public final String a(Object obj, m mVar) {
        File file = (File) obj;
        if (!this.f16283a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
