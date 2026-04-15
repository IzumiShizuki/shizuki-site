package h;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import jc.l;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7567d;

    public /* synthetic */ a(int i10) {
        this.f7567d = i10;
    }

    @Override // a.a
    public void G(Context context, Object obj) {
        switch (this.f7567d) {
            case 0:
                break;
        }
    }

    @Override // a.a
    public final Object J(Intent intent, int i10) {
        switch (this.f7567d) {
            case 0:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                return new g.a(intent, i10);
            default:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Uri uri = clipData.getItemAt(i11).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        return new ArrayList(linkedHashSet);
                    }
                }
                return r.f22819a;
        }
    }

    @Override // a.a
    public final Intent z(Context context, Object obj) {
        switch (this.f7567d) {
            case 0:
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj);
                l.d(type, "setType(...)");
                return type;
            case 1:
                return (Intent) obj;
            default:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType((String) obj);
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                intent.addFlags(64);
                intent.addFlags(1);
                return intent;
        }
    }
}
