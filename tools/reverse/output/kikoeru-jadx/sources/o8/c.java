package o8;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import jc.l;
import s8.m;
import x8.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // o8.b
    public final String a(Object obj, m mVar) {
        Uri uri = (Uri) obj;
        if (!l.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = mVar.f19641a.getResources().getConfiguration();
        Bitmap.Config[] configArr = d.f24838a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
