package m8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14942a;

    public /* synthetic */ a(int i10) {
        this.f14942a = i10;
    }

    @Override // m8.f
    public final g a(Object obj, s8.m mVar) {
        switch (this.f14942a) {
            case 0:
                Uri uri = (Uri) obj;
                if (x8.d.c(uri)) {
                    return new b(uri, mVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, mVar, 0);
            case 2:
                return new c((ByteBuffer) obj, mVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (jc.l.a(uri2.getScheme(), "content")) {
                    return new b(uri2, mVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, mVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (jc.l.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, mVar, 2);
                }
                return null;
        }
    }
}
