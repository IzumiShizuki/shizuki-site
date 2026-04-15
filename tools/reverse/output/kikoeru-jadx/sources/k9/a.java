package k9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ba.u0;
import c7.e1;
import hf.a0;
import java.util.concurrent.Callable;
import nd.h;
import yb.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4.b f11226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11227c;

    public /* synthetic */ a(Object obj, e1 e1Var, int i10) {
        this.f11225a = i10;
        this.f11227c = obj;
        this.f11226b = e1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11225a) {
            case 0:
                byte[] bArr = (byte[]) this.f11227c;
                e1 e1Var = (e1) this.f11226b;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                e1Var.f3620d = bitmapDecodeByteArray;
                return bitmapDecodeByteArray;
            case 1:
                return (Bitmap) a0.C(i.f26088a, new u0((Uri) this.f11227c, (e1) this.f11226b, null, 26));
            default:
                s4.i iVar = (s4.i) this.f11226b;
                byte[] bArr2 = (byte[]) this.f11227c;
                return h.f(bArr2, bArr2.length, iVar.f19425b);
        }
    }

    public /* synthetic */ a(s4.i iVar, byte[] bArr) {
        this.f11225a = 2;
        this.f11226b = iVar;
        this.f11227c = bArr;
    }
}
