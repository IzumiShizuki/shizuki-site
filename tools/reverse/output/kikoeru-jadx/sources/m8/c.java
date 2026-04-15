package m8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import f8.q;
import j8.p;
import java.nio.ByteBuffer;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.m f14947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14948c;

    public /* synthetic */ c(Object obj, s8.m mVar, int i10) {
        this.f14946a = i10;
        this.f14948c = obj;
        this.f14947b = mVar;
    }

    @Override // m8.g
    public final Object a(yb.c cVar) {
        int i10 = this.f14946a;
        j8.f fVar = j8.f.f10614b;
        Object obj = this.f14948c;
        s8.m mVar = this.f14947b;
        switch (i10) {
            case 0:
                return new d(new BitmapDrawable(mVar.f19641a.getResources(), (Bitmap) obj), false, fVar);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    lh.f fVar2 = new lh.f();
                    fVar2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = mVar.f19641a;
                    return new m(new p(fVar2, null), null, fVar);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = x8.d.f24838a;
                boolean z10 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof q);
                if (z10) {
                    bitmapDrawable = new BitmapDrawable(mVar.f19641a.getResources(), w.d(bitmapDrawable, mVar.f19642b, mVar.f19644d, mVar.f19645e, mVar.f19646f));
                }
                return new d(bitmapDrawable, z10, fVar);
        }
    }
}
