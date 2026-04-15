package aa;

import a9.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RatingBar;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hf.j;
import ic.k;
import jc.l;
import ka.n;
import m0.v7;
import o1.u;
import q1.q;
import ub.a0;
import x0.f0;
import x0.p1;
import x0.w0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f283b;

    public /* synthetic */ d(w0 w0Var, int i10) {
        this.f282a = i10;
        this.f283b = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        j jVar;
        Uri data;
        switch (this.f282a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f283b.setValue(bool);
                p1 p1Var = ka.b.f11244f;
                if (p1Var != null) {
                    p1Var.c();
                }
                break;
            case 1:
                u uVar = (u) obj;
                l.e(uVar, "it");
                this.f283b.setValue(Boolean.valueOf(uVar.a()));
                break;
            case 2:
                y yVar = (y) obj;
                l.e(yVar, "it");
                this.f283b.setValue(yVar);
                break;
            case 3:
                this.f283b.setValue(Boolean.TRUE);
                break;
            case 4:
                this.f283b.setValue(Boolean.TRUE);
                break;
            case 5:
                Float f10 = (Float) obj;
                f10.floatValue();
                this.f283b.setValue(f10);
                break;
            case 6:
                l.c(obj, "null cannot be cast to non-null type T of loli.ball.okkv.OkkvStateExtendsKt.observeAsState");
                this.f283b.setValue(obj);
                break;
            case 7:
                p1.b bVar = (p1.b) obj;
                k kVar = (k) this.f283b.getValue();
                if (kVar != null) {
                    kVar.a(bVar);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                p1.b bVar2 = (p1.b) obj;
                k kVar2 = (k) this.f283b.getValue();
                if (kVar2 != null) {
                    kVar2.a(bVar2);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((k) this.f283b.getValue()).a((p1.b) obj);
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                String str = (String) obj;
                l.e(str, "it");
                this.f283b.setValue(str);
                break;
            case 11:
                l.e((f0) obj, "$this$DisposableEffect");
                break;
            case 12:
                s1.d dVar = (s1.d) obj;
                long j10 = ((q) this.f283b.getValue()).f17577a;
                float fQ = dVar.Q(v7.f13768a);
                float fQ2 = dVar.Q(v7.f13769b);
                float f11 = fQ2 / 2;
                dVar.w(j10, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fQ - f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L))))), fQ2, (496 & 16) != 0 ? 0 : 1);
                break;
            case 13:
                String str2 = (String) obj;
                l.e(str2, "it");
                this.f283b.setValue(str2);
                break;
            case 14:
                ((Boolean) obj).getClass();
                this.f283b.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                break;
            case 15:
                String str3 = (String) obj;
                l.e(str3, "it");
                this.f283b.setValue(str3);
                break;
            case 16:
                String str4 = (String) obj;
                l.e(str4, "it");
                this.f283b.setValue(str4);
                break;
            case 17:
                Context context = (Context) obj;
                l.e(context, "it");
                RatingBar ratingBar = new RatingBar(context);
                ratingBar.setMax(5);
                ratingBar.setStepSize(1.0f);
                final w0 w0Var = this.f283b;
                Integer num = (Integer) w0Var.getValue();
                ratingBar.setProgress(num != null ? num.intValue() : 0);
                ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: ma.b
                    @Override // android.widget.RatingBar.OnRatingBarChangeListener
                    public final void onRatingChanged(RatingBar ratingBar2, float f12, boolean z10) {
                        w0Var.setValue(Integer.valueOf((int) f12));
                    }
                });
                break;
            case 18:
                String str5 = (String) obj;
                l.e(str5, "it");
                this.f283b.setValue(str5);
                break;
            case 19:
                Uri uri = (Uri) obj;
                if (uri != null && (jVar = (j) this.f283b.getValue()) != null) {
                    na.q.d(uri, "");
                    jVar.h(uri);
                }
                break;
            case 20:
                long j11 = ((f3.l) obj).f6666a;
                this.f283b.setValue(new p1.b((((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32)));
                break;
            case 21:
                this.f283b.setValue(new p1.b(((p1.b) obj).f16481a));
                break;
            case 22:
                g.a aVar = (g.a) obj;
                l.e(aVar, "activityResult");
                Intent intent = aVar.f7105b;
                if (intent != null && (data = intent.getData()) != null) {
                    i.a().grantUriPermission(i.a().getPackageName(), data, 3);
                    i.a().getContentResolver().takePersistableUriPermission(data, 3);
                    n.c(na.q.g(R.string.open_document_success), 0L, null, null, 511);
                    na.q.d(data, "selectDocument");
                    j jVar2 = (j) this.f283b.getValue();
                    if (jVar2 != null) {
                        jVar2.h(data);
                    }
                }
                break;
            case 23:
                String str6 = (String) obj;
                l.e(str6, "it");
                this.f283b.setValue(str6);
                break;
            case 24:
                String str7 = (String) obj;
                l.e(str7, "it");
                this.f283b.setValue(str7);
                break;
            case 25:
                String str8 = (String) obj;
                l.e(str8, "it");
                this.f283b.setValue(str8);
                break;
            case 26:
                ((Boolean) obj).getClass();
                this.f283b.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                break;
            case 27:
                String str9 = (String) obj;
                l.e(str9, "it");
                this.f283b.setValue(str9);
                break;
            case 28:
                ((Boolean) obj).getClass();
                this.f283b.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                break;
            default:
                String str10 = (String) obj;
                l.e(str10, "it");
                this.f283b.setValue(str10);
                break;
        }
        return a0.f21526a;
    }
}
