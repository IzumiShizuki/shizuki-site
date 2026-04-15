package ea;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cnl.kikoeru.R;
import ic.n;
import java.util.Arrays;
import m0.z8;
import ub.a0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6434c;

    public /* synthetic */ d(String str, int i10, int i11, String str2) {
        this.f6432a = i11;
        this.f6433b = str;
        this.f6434c = str2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f6432a;
        a0 a0Var = a0.f21526a;
        String str = this.f6434c;
        String str2 = this.f6433b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                a.a(str2, str, (o) obj, v.D(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g8.a.g(str2, str, (o) obj, v.D(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ha.b.b(str2, str, (o) obj, v.D(1));
                break;
            default:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    z8.b(((Resources) oVar.j(AndroidCompositionLocals_androidKt.f722c)).getString(R.string.confirm_regist_message, Arrays.copyOf(new Object[]{str2, str}, 2)), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ d(String str, String str2) {
        this.f6432a = 3;
        this.f6433b = str;
        this.f6434c = str2;
    }
}
