package s3;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;
import p4.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f19361b;

    public a(Context context, Uri uri, int i10) {
        this.f19360a = i10;
        switch (i10) {
            case 1:
                this.f19361b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f19361b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws Exception {
        switch (this.f19360a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f19361b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f19361b;
                if (contentProviderClient2 != 0) {
                    if (contentProviderClient2 instanceof AutoCloseable) {
                        contentProviderClient2.close();
                    } else if (!(contentProviderClient2 instanceof ExecutorService)) {
                        contentProviderClient2.release();
                    } else {
                        z.q((ExecutorService) contentProviderClient2);
                    }
                }
                break;
        }
    }
}
