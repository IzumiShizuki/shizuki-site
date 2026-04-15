.class public Lcom/tencent/bugly/beta/upgrade/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static a:Lcom/tencent/bugly/beta/upgrade/d;


# instance fields
.field public b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

.field public c:Lcom/tencent/bugly/beta/download/DownloadTask;

.field public d:Lcom/tencent/bugly/beta/download/DownloadListener;

.field public e:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

.field public f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

.field public g:Z

.field public h:Z

.field public i:Lcom/tencent/bugly/beta/global/d;

.field public j:Lcom/tencent/bugly/beta/global/d;

.field public k:I

.field private final l:Ljava/lang/Object;

.field private final m:Ljava/lang/Object;

.field private n:Lcom/tencent/bugly/beta/download/DownloadListener;

.field private o:Lcom/tencent/bugly/beta/upgrade/a;

.field private p:Lcom/tencent/bugly/beta/global/d;

.field private q:Z

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/beta/upgrade/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/beta/upgrade/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->l:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->m:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/bugly/beta/download/a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x2

    .line 26
    new-array v3, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object p0, v3, v1

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    aput-object v2, v3, v1

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {v0, v1, v3}, Lcom/tencent/bugly/beta/download/a;-><init>(I[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->n:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method private a()V
    .locals 13

    .line 124
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->b()Lcom/tencent/bugly/proguard/B;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v1, :cond_1

    .line 126
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->c()Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 127
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v1, :cond_2

    :goto_0
    return-void

    .line 128
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-direct {p0, v1}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V

    .line 129
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-static {v1}, Lcom/tencent/bugly/beta/download/BetaReceiver;->addTask(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 130
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    iget-boolean v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->h:Z

    if-nez v1, :cond_4

    .line 131
    iget-boolean v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    if-eqz v1, :cond_3

    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 132
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    move-result-object v2

    iget-object v3, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 133
    invoke-static {v1, v2, v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 134
    sget-object v1, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    new-instance v2, Lcom/tencent/bugly/proguard/z;

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v9, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget v11, v0, Lcom/tencent/bugly/proguard/B;->u:I

    const-wide/16 v7, 0x0

    const/4 v12, 0x0

    const-string v3, "install"

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 136
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    return-void

    .line 137
    :cond_3
    iget-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    invoke-direct {p0, v0}, Lcom/tencent/bugly/beta/upgrade/d;->b(Z)V

    return-void

    .line 138
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    return-void
.end method

.method private a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V
    .locals 2

    .line 226
    iget-object v0, p1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "app.upgrade.strategy.bch"

    .line 227
    invoke-static {v0, p1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/beta/upgrade/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/bugly/beta/upgrade/d;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 10

    .line 139
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->b()Lcom/tencent/bugly/proguard/B;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/B;->b()J

    move-result-wide v3

    const-wide/32 v5, 0x5265c00

    sub-long/2addr v3, v5

    const/4 v5, 0x0

    cmp-long v6, v1, v3

    if-gtz v6, :cond_1

    .line 141
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "ms"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 142
    :cond_1
    sget-object v1, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v3, v0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    invoke-virtual {v1, v2, v3}, Lcom/tencent/bugly/beta/global/f;->a(Lcom/tencent/bugly/beta/download/c;Ljava/util/Map;)V

    .line 143
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v1, :cond_2

    .line 144
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->c()Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 145
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v1, :cond_3

    :goto_0
    return-void

    :cond_3
    const/4 v2, 0x1

    const/4 v3, 0x2

    if-nez p1, :cond_4

    .line 146
    invoke-virtual {v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 147
    iget-object p1, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 148
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v5

    aput-object v0, v1, v2

    const-string p1, "Task is downloading %s %s"

    .line 149
    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 150
    :cond_4
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->n:Lcom/tencent/bugly/beta/download/DownloadListener;

    invoke-virtual {v1, v4}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 151
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->d:Lcom/tencent/bugly/beta/download/DownloadListener;

    if-eqz v1, :cond_5

    .line 152
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v4, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 153
    :cond_5
    sget-object v1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 154
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v1, v0, v4}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->setUpgradeInfo(Lcom/tencent/bugly/proguard/B;Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 155
    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    iget-object v6, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v7, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v6, v8, v5

    aput-object v7, v8, v2

    const/4 v6, 0x3

    invoke-direct {v4, v6, v8}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    iput-object v4, v1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->upgradeRunnable:Ljava/lang/Runnable;

    .line 156
    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    iget-object v7, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v8, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 157
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v7, v6, v5

    aput-object v8, v6, v2

    aput-object v9, v6, v3

    const/4 v7, 0x4

    invoke-direct {v4, v7, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    iput-object v4, v1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->cancelRunnable:Ljava/lang/Runnable;

    .line 158
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 159
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-direct {p0, v4}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V

    if-eqz p1, :cond_6

    .line 160
    sget-object v0, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v1, v6, v5

    aput-object p1, v6, v2

    invoke-direct {v4, v3, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    const/16 p1, 0xbb8

    invoke-virtual {v0, v4, p1}, Lcom/tencent/bugly/beta/global/f;->a(Ljava/lang/Runnable;I)V

    return-void

    .line 161
    :cond_6
    sget-object v4, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    new-instance v6, Lcom/tencent/bugly/beta/global/d;

    if-nez p1, :cond_8

    iget-byte p1, v0, Lcom/tencent/bugly/proguard/B;->l:B

    if-ne p1, v3, :cond_7

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    goto :goto_2

    :cond_8
    :goto_1
    const/4 p1, 0x1

    .line 162
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v1, v0, v5

    aput-object p1, v0, v2

    invoke-direct {v6, v3, v0}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 163
    invoke-virtual {v4, v6}, Lcom/tencent/bugly/beta/global/f;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private b()Lcom/tencent/bugly/proguard/B;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    return-object v0
.end method

.method private b(Z)V
    .locals 2

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3
    new-instance v1, Ld7/b;

    invoke-direct {v1, p0, p1}, Ld7/b;-><init>(Lcom/tencent/bugly/beta/upgrade/d;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c()Lcom/tencent/bugly/beta/download/DownloadTask;
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->b()Lcom/tencent/bugly/proguard/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 14
    .line 15
    iget-object v3, v2, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 30
    .line 31
    iget-object v4, v4, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 32
    .line 33
    iget-object v4, v4, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v3, v0, v2, v1, v4}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 46
    .line 47
    return-object v0
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/B;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v1, Lcom/tencent/bugly/beta/upgrade/d;->l:Ljava/lang/Object;

    monitor-enter v2

    const-string v3, "app.upgrade.strategy.bch"

    .line 3
    :try_start_0
    sget-object v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 4
    invoke-static {v3, v4}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 5
    iget-object v5, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_0

    const-string v3, "app.upgrade.strategy.bch"

    .line 6
    :try_start_1
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    move-object v3, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    :goto_0
    const/4 v5, 0x1

    if-eqz v3, :cond_3

    .line 7
    iget-object v6, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v6, :cond_3

    .line 8
    iget-object v7, v6, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    iget v8, v7, Lcom/tencent/bugly/proguard/y;->d:I

    sget-object v9, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget v10, v9, Lcom/tencent/bugly/beta/global/e;->z:I

    if-lt v8, v10, :cond_2

    if-ne v8, v10, :cond_1

    iget v7, v7, Lcom/tencent/bugly/proguard/y;->f:I

    iget v8, v9, Lcom/tencent/bugly/beta/global/e;->r:I

    if-le v7, v8, :cond_2

    :cond_1
    iget v7, v6, Lcom/tencent/bugly/proguard/B;->s:I

    if-ne v7, v5, :cond_2

    iget-object v6, v6, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    if-eqz v6, :cond_3

    iget-object v7, v9, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    iget-object v6, v6, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 9
    invoke-static {v7, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_3

    :cond_2
    const-string v3, "app.upgrade.strategy.bch"

    .line 10
    :try_start_2
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    .line 11
    iput-object v4, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    move-object v3, v4

    :cond_3
    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v0, :cond_5

    .line 12
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    iget v11, v10, Lcom/tencent/bugly/proguard/y;->d:I

    sget-object v12, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget v13, v12, Lcom/tencent/bugly/beta/global/e;->z:I

    if-lt v11, v13, :cond_4

    if-ne v11, v13, :cond_5

    iget v10, v10, Lcom/tencent/bugly/proguard/y;->f:I

    iget v12, v12, Lcom/tencent/bugly/beta/global/e;->r:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-gt v10, v12, :cond_5

    :cond_4
    const-string v10, "versionCode is too small, discard remote strategy: [new: %d buildno: %d] [current: %d buildno: %d]"

    .line 13
    :try_start_3
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    iget v0, v0, Lcom/tencent/bugly/proguard/y;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v12, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget v12, v12, Lcom/tencent/bugly/beta/global/e;->z:I

    .line 14
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    sget-object v13, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget v13, v13, Lcom/tencent/bugly/beta/global/e;->r:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-array v14, v7, [Ljava/lang/Object;

    aput-object v11, v14, v9

    aput-object v0, v14, v5

    aput-object v12, v14, v8

    aput-object v13, v14, v6

    .line 15
    invoke-static {v10, v14}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v4

    :cond_5
    if-eqz v0, :cond_7

    .line 16
    iget v10, v0, Lcom/tencent/bugly/proguard/B;->s:I

    if-ne v10, v8, :cond_6

    if-eqz v3, :cond_6

    .line 17
    iget-object v10, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 18
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_6

    iget-object v10, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 19
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_6

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget-object v11, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 20
    invoke-static {v10, v11}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v10, :cond_6

    const-string v3, "\u64a4\u56de strategy: %s"

    .line 21
    :try_start_4
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    new-array v11, v5, [Ljava/lang/Object;

    aput-object v10, v11, v9

    invoke-static {v3, v11}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v3, v4

    .line 22
    :cond_6
    iget v10, v0, Lcom/tencent/bugly/proguard/B;->s:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eq v10, v5, :cond_7

    const-string v10, "invalid strategy: %s"

    .line 23
    :try_start_5
    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    new-array v11, v5, [Ljava/lang/Object;

    aput-object v0, v11, v9

    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v4

    :cond_7
    if-eqz v0, :cond_d

    if-eqz v3, :cond_8

    .line 24
    iget-object v10, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 25
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_8

    iget-object v10, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v10, v10, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 26
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_8

    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget-object v11, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 27
    invoke-static {v10, v11}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 28
    new-instance v10, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-static {v3}, Lcom/tencent/bugly/proguard/ca;->a(Landroid/os/Parcelable;)[B

    move-result-object v11

    invoke-static {v11}, Lcom/tencent/bugly/proguard/ca;->d([B)Landroid/os/Parcel;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;-><init>(Landroid/os/Parcel;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v11, "same strategyId:[new: %s] [current: %s] keep has popup times: %d, interval: %d"

    .line 29
    :try_start_6
    iget-object v12, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget-object v13, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v13, v13, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget v14, v10, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 30
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 p1, v10

    const/4 v15, 0x0

    iget-wide v9, v0, Lcom/tencent/bugly/proguard/B;->n:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v12, v7, v15

    aput-object v13, v7, v5

    aput-object v14, v7, v8

    aput-object v9, v7, v6

    .line 31
    invoke-static {v11, v7}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object/from16 v10, p1

    goto :goto_1

    :cond_8
    const/4 v15, 0x0

    .line 32
    new-instance v10, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-direct {v10}, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;-><init>()V

    .line 33
    :goto_1
    iput-object v0, v10, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v10, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    if-eqz v3, :cond_c

    .line 35
    iget-object v6, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v6, v6, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v6, v6, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v7, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v7, v7, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 36
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 37
    iget-object v6, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v6, :cond_b

    .line 38
    sget-object v6, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v7, v6, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v3, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v6, v6, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 39
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    .line 40
    invoke-interface {v7, v3, v6, v4, v4}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v3

    iput-object v3, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 41
    invoke-virtual {v3, v5}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 42
    iget-object v3, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v3, v5}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 43
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    array-length v6, v3

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_a

    aget-object v9, v3, v7

    .line 44
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v11, :cond_9

    const-string v11, "cannot deleteCache file:%s"

    .line 45
    :try_start_7
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    new-array v12, v5, [Ljava/lang/Object;

    aput-object v9, v12, v15

    invoke-static {v11, v12}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 46
    :cond_a
    iput-object v4, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    goto :goto_3

    .line 47
    :cond_b
    sget-object v3, Lcom/tencent/bugly/beta/download/BetaReceiver;->netListeners:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v3, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v3, v5}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 49
    iput-object v4, v1, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 50
    :cond_c
    :goto_3
    invoke-direct {v1, v10}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v3, "onUpgradeReceived: %s [type: %d]"

    .line 51
    :try_start_8
    iget-byte v4, v0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 52
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v8, [Ljava/lang/Object;

    aput-object v0, v6, v15

    aput-object v4, v6, v5

    .line 53
    invoke-static {v3, v6}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 54
    sget-object v3, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    new-instance v11, Lcom/tencent/bugly/proguard/z;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v12, "rcv"

    .line 55
    :try_start_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    iget-object v4, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    iget-object v5, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    const/16 v21, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    move/from16 v20, v0

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 56
    invoke-virtual {v3, v11}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    move-object v4, v10

    .line 57
    :cond_d
    monitor-exit v2

    return-object v4

    .line 58
    :goto_4
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw v0
.end method

.method public a(Lcom/tencent/bugly/proguard/sa;)V
    .locals 6

    .line 205
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v1, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    if-nez v1, :cond_0

    .line 206
    new-instance v1, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    invoke-direct {v1}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;-><init>()V

    iput-object v1, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    :cond_0
    if-eqz p1, :cond_8

    .line 207
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-wide v1, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->b:J

    iget-wide v3, p1, Lcom/tencent/bugly/proguard/sa;->k:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    goto/16 :goto_0

    .line 208
    :cond_1
    iput-wide v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->b:J

    .line 209
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/sa;->e:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/sa;->e:Z

    .line 210
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/sa;->f:Z

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/sa;->f:Z

    .line 211
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/sa;->k:J

    .line 212
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 213
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->g:Ljava/lang/String;

    .line 214
    :cond_2
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 215
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    .line 216
    :cond_3
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->i:Lcom/tencent/bugly/proguard/ra;

    if-eqz v0, :cond_4

    .line 217
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ra;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 218
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/sa;->i:Lcom/tencent/bugly/proguard/ra;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->i:Lcom/tencent/bugly/proguard/ra;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/ra;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/ra;->a:Ljava/lang/String;

    .line 219
    :cond_4
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 220
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->j:Ljava/util/Map;

    .line 221
    :cond_5
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 222
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/sa;->l:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/bugly/proguard/sa;->l:Ljava/lang/String;

    .line 223
    :cond_6
    iget-object v0, p1, Lcom/tencent/bugly/proguard/sa;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 224
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/sa;->m:Ljava/lang/String;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/sa;->m:Ljava/lang/String;

    .line 225
    :cond_7
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object p1, p1, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    const-string v0, "us.bch"

    invoke-static {v0, p1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    :cond_8
    :goto_0
    return-void
.end method

.method public a(ZZI)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v3, p1

    move/from16 v0, p3

    const-string v2, ""

    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v8, 0x1

    new-array v5, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v4, v5, v9

    const-string v4, "requestGrayTactics strategyType:[%s]"

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 165
    iget-object v10, v1, Lcom/tencent/bugly/beta/upgrade/d;->m:Ljava/lang/Object;

    monitor-enter v10

    const-string v4, "requestGrayTactics1 strategyType:[%s]"

    .line 166
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v6, v8, [Ljava/lang/Object;

    aput-object v5, v6, v9

    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x3

    if-ne v0, v8, :cond_0

    const-string v5, "app.upgrade.strategy.bch"

    .line 167
    :try_start_1
    sget-object v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v5, v6}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    const/4 v5, 0x0

    if-nez v0, :cond_6

    const-string v6, "hotfix.strategy.bch"

    .line 168
    :try_start_2
    sget-object v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v6, v7}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v11, "app.upgrade.strategy.bch"

    .line 169
    :try_start_3
    invoke-static {v11, v7}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-eqz v6, :cond_1

    .line 170
    iget-object v11, v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v11, :cond_1

    if-eqz v7, :cond_1

    iget-object v11, v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v11, :cond_1

    .line 171
    iget-wide v11, v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    iget-wide v13, v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    cmp-long v15, v11, v13

    if-lez v15, :cond_4

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_4

    .line 172
    iget-object v11, v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v7, :cond_5

    .line 173
    iget-object v7, v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    move-object v6, v5

    goto :goto_1

    :cond_4
    :goto_0
    move-object v6, v7

    :cond_5
    :goto_1
    if-eqz v3, :cond_7

    if-eqz v6, :cond_7

    .line 174
    iget-object v7, v6, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v7, :cond_7

    iget v7, v7, Lcom/tencent/bugly/proguard/B;->u:I

    if-ne v7, v4, :cond_7

    :cond_6
    :goto_2
    move-object v11, v5

    goto :goto_3

    :cond_7
    move-object v11, v6

    .line 175
    :goto_3
    iget-object v5, v1, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    const/4 v12, 0x2

    if-eqz v5, :cond_9

    iget-boolean v6, v5, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    if-nez v6, :cond_9

    iget-boolean v6, v1, Lcom/tencent/bugly/beta/upgrade/d;->q:Z

    if-ne v6, v3, :cond_9

    iget v6, v1, Lcom/tencent/bugly/beta/upgrade/d;->r:I

    if-eq v6, v0, :cond_8

    goto :goto_4

    .line 176
    :cond_8
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 177
    :try_start_4
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v9

    .line 178
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v8

    .line 179
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 180
    :try_start_5
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->p:Lcom/tencent/bugly/beta/global/d;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v2, v0, v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    .line 181
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw v0

    .line 182
    :cond_9
    :goto_4
    iput-boolean v3, v1, Lcom/tencent/bugly/beta/upgrade/d;->q:Z

    .line 183
    iput v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->r:I

    if-eqz v5, :cond_a

    .line 184
    iput-boolean v8, v5, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    .line 185
    :cond_a
    new-instance v5, Lcom/tencent/bugly/beta/upgrade/a;

    .line 186
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v6, v4, v9

    aput-object v7, v4, v8

    aput-object v11, v4, v12

    const/16 v6, 0x324

    invoke-direct {v5, v8, v6, v4}, Lcom/tencent/bugly/beta/upgrade/a;-><init>(II[Ljava/lang/Object;)V

    iput-object v5, v1, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    .line 187
    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    new-array v6, v12, [Ljava/lang/Object;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v7, v6, v9

    aput-object v5, v6, v8

    const/16 v5, 0xc

    invoke-direct {v4, v5, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    iput-object v4, v1, Lcom/tencent/bugly/beta/upgrade/d;->p:Lcom/tencent/bugly/beta/global/d;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v4, ""

    if-eqz v11, :cond_b

    .line 188
    :try_start_8
    iget-object v5, v11, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v5, :cond_b

    .line 189
    iget-object v4, v5, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 190
    iget-wide v5, v5, Lcom/tencent/bugly/proguard/B;->t:J

    .line 191
    iget v7, v11, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_b
    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    .line 192
    :goto_5
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    const-string v14, "hasPopTimes"

    .line 193
    :try_start_9
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    const-string v2, "G16"

    .line 194
    :try_start_a
    sget-object v7, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v7, v7, Lcom/tencent/bugly/beta/global/e;->N:Ljava/lang/String;

    invoke-virtual {v13, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    new-instance v2, Lcom/tencent/bugly/proguard/C;

    move-object v7, v13

    invoke-direct/range {v2 .. v7}, Lcom/tencent/bugly/proguard/C;-><init>(ILjava/lang/String;JLjava/util/Map;)V

    .line 196
    invoke-static {v2}, Lcom/tencent/bugly/proguard/M;->a(Lcom/tencent/bugly/proguard/m;)[B

    move-result-object v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    const-string v2, "requestGrayTactics2 strategyType:[%s]"

    .line 197
    :try_start_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v8, [Ljava/lang/Object;

    aput-object v3, v4, v9

    invoke-static {v2, v4}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 198
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/b;->a:Lcom/tencent/bugly/beta/upgrade/b;

    iget-object v6, v1, Lcom/tencent/bugly/beta/upgrade/d;->o:Lcom/tencent/bugly/beta/upgrade/a;

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    iget-object v3, v3, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    iget-object v8, v3, Lcom/tencent/bugly/proguard/sa;->h:Ljava/lang/String;

    const/16 v3, 0x324

    move/from16 v7, p1

    move v4, v0

    invoke-virtual/range {v2 .. v8}, Lcom/tencent/bugly/beta/upgrade/b;->a(II[BLcom/tencent/bugly/beta/upgrade/a;ZLjava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_7

    .line 199
    :goto_6
    :try_start_c
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 200
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_c
    :goto_7
    if-eqz p1, :cond_d

    if-eqz p2, :cond_e

    :cond_d
    if-eqz v11, :cond_f

    .line 201
    iget-object v0, v11, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v0, :cond_f

    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    if-ne v0, v12, :cond_f

    .line 202
    :cond_e
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->p:Lcom/tencent/bugly/beta/global/d;

    invoke-static {v0}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    .line 203
    iget-object v0, v1, Lcom/tencent/bugly/beta/upgrade/d;->p:Lcom/tencent/bugly/beta/global/d;

    const-wide/16 v2, 0x1770

    invoke-static {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V

    .line 204
    :cond_f
    monitor-exit v10

    return-void

    :goto_8
    monitor-exit v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    throw v0
.end method

.method public a(ZZILcom/tencent/bugly/proguard/B;Ljava/lang/String;)V
    .locals 14

    move v0, p1

    move/from16 v1, p2

    .line 59
    iget-object v2, p0, Lcom/tencent/bugly/beta/upgrade/d;->l:Ljava/lang/Object;

    monitor-enter v2

    const/4 v3, 0x0

    .line 60
    :try_start_0
    iput-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    move-object/from16 v4, p4

    .line 61
    invoke-virtual {p0, v4}, Lcom/tencent/bugly/beta/upgrade/d;->a(Lcom/tencent/bugly/proguard/B;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    move-result-object v4

    iput-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 62
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    .line 63
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->h:Z

    .line 64
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->e:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v7, 0x3

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v4, :cond_6

    const-string v4, "\u4f60\u5df2\u653e\u5f03\u8ba9SDK\u6765\u5904\u7406\u7b56\u7565"

    .line 65
    :try_start_1
    new-array v11, v9, [Ljava/lang/Object;

    invoke-static {v4, v11}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 66
    iput v7, p0, Lcom/tencent/bugly/beta/upgrade/d;->k:I

    .line 67
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_0

    const-string v0, "betaStrategy is null"

    .line 68
    :try_start_2
    new-array v1, v9, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 69
    new-instance v0, Lcom/tencent/bugly/beta/global/d;

    new-array v1, v10, [Ljava/lang/Object;

    sget-object v3, Lcom/tencent/bugly/beta/Beta;->strToastYourAreTheLatestVersion:Ljava/lang/String;

    aput-object v3, v1, v9

    invoke-direct {v0, v8, v1}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 70
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    .line 71
    :cond_0
    iget-object v11, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v11, :cond_2

    if-nez v0, :cond_2

    .line 72
    iget-wide v12, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    const/16 p4, 0x2

    const/16 p5, 0x4

    iget-wide v5, v11, Lcom/tencent/bugly/proguard/B;->n:J

    add-long/2addr v12, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v6, v12, v4

    if-gtz v6, :cond_1

    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v5, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget v5, v5, Lcom/tencent/bugly/proguard/B;->m:I

    iget v4, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    sub-int/2addr v5, v4

    if-gtz v5, :cond_3

    .line 73
    :cond_1
    monitor-exit v2

    return-void

    :cond_2
    const/16 p4, 0x2

    const/16 p5, 0x4

    .line 74
    :cond_3
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-eqz v4, :cond_4

    iget-object v5, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v5, :cond_4

    .line 75
    sget-object v5, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v6, v5, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v4, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v5, v5, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 76
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    iget-object v11, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v11, v11, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v11, v11, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 77
    invoke-interface {v6, v4, v5, v3, v11}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v4

    iput-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 78
    invoke-virtual {v4, v10}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 79
    :cond_4
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v4, :cond_5

    const-string v4, "\u7528\u6237\u81ea\u5b9a\u4e49activity\uff0c\u521b\u5efatask\u5931\u8d25 [strategy:%s]"

    .line 80
    :try_start_3
    iget-object v5, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    new-array v6, v10, [Ljava/lang/Object;

    aput-object v5, v6, v9

    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 81
    iput-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v3, "app.upgrade.strategy.bch"

    .line 82
    :try_start_4
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    goto :goto_0

    .line 83
    :cond_5
    iget-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->n:Lcom/tencent/bugly/beta/download/DownloadListener;

    invoke-virtual {v4, v3}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 84
    :goto_0
    new-instance v3, Lcom/tencent/bugly/beta/global/d;

    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->e:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    new-array v13, v8, [Ljava/lang/Object;

    aput-object v4, v13, v9

    aput-object v5, v13, v10

    aput-object v6, v13, p4

    aput-object v11, v13, v7

    aput-object v12, v13, p5

    const/16 v4, 0x10

    invoke-direct {v3, v4, v13}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_6
    const/16 p4, 0x2

    const/16 p5, 0x4

    :goto_1
    const/16 v3, 0x12

    if-eqz p3, :cond_8

    if-eqz v0, :cond_8

    if-nez v1, :cond_8

    .line 85
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-nez v4, :cond_8

    .line 86
    iget-object v1, p0, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    if-eqz v1, :cond_7

    .line 87
    new-instance v4, Lcom/tencent/bugly/beta/global/d;

    const/4 v5, -0x1

    .line 88
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v1, v6, v9

    aput-object v5, v6, v10

    aput-object v0, v6, p4

    invoke-direct {v4, v3, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 89
    invoke-static {v4}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 90
    :cond_7
    new-instance v0, Lcom/tencent/bugly/beta/global/d;

    new-array v1, v10, [Ljava/lang/Object;

    sget-object v3, Lcom/tencent/bugly/beta/Beta;->strToastCheckUpgradeError:Ljava/lang/String;

    aput-object v3, v1, v9

    invoke-direct {v0, v8, v1}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 91
    invoke-static {v0}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 92
    :goto_2
    monitor-exit v2

    return-void

    .line 93
    :cond_8
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    if-eqz v4, :cond_16

    iget-object v4, v4, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    if-eqz v4, :cond_16

    .line 94
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v4, :cond_9

    .line 95
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->c()Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v4

    iput-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 96
    :cond_9
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    iget-object v5, p0, Lcom/tencent/bugly/beta/upgrade/d;->n:Lcom/tencent/bugly/beta/download/DownloadListener;

    invoke-virtual {v4, v5}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 97
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    if-eqz v4, :cond_a

    .line 98
    new-instance v5, Lcom/tencent/bugly/beta/global/d;

    .line 99
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    new-array v11, v7, [Ljava/lang/Object;

    aput-object v4, v11, v9

    aput-object v6, v11, v10

    aput-object v8, v11, p4

    invoke-direct {v5, v3, v11}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 100
    invoke-static {v5}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 101
    :cond_a
    iget-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->e:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    if-eqz v3, :cond_b

    .line 102
    monitor-exit v2

    return-void

    :cond_b
    if-nez v0, :cond_12

    .line 103
    iget-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v4, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget-byte v5, v4, Lcom/tencent/bugly/proguard/B;->l:B

    const/4 v6, 0x2

    if-eq v5, v6, :cond_12

    .line 104
    iget-boolean v5, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    if-eqz v5, :cond_10

    sget-object v5, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v6, v5, Lcom/tencent/bugly/beta/global/e;->h:Z

    if-eqz v6, :cond_10

    .line 105
    iget-object v3, v5, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;)I

    move-result v3

    if-ne v3, v10, :cond_c

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v3, v3, Lcom/tencent/bugly/beta/global/e;->U:Z

    if-nez v3, :cond_d

    :cond_c
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 106
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;)I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_e

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v3, v3, Lcom/tencent/bugly/beta/global/e;->V:Z

    if-eqz v3, :cond_e

    .line 107
    :cond_d
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->a()V

    .line 108
    monitor-exit v2

    return-void

    :cond_e
    if-nez v1, :cond_f

    .line 109
    invoke-direct/range {p0 .. p1}, Lcom/tencent/bugly/beta/upgrade/d;->b(Z)V

    .line 110
    :cond_f
    monitor-exit v2

    return-void

    .line 111
    :cond_10
    iget-wide v5, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    iget-wide v3, v4, Lcom/tencent/bugly/proguard/B;->n:J

    add-long/2addr v5, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v8, v5, v3

    if-gtz v8, :cond_11

    iget-object v3, p0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    iget-object v4, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    iget v5, v4, Lcom/tencent/bugly/proguard/B;->m:I

    iget v3, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    sub-int/2addr v5, v3

    if-lez v5, :cond_11

    iget-byte v3, v4, Lcom/tencent/bugly/proguard/B;->l:B

    if-ne v3, v7, :cond_12

    .line 112
    :cond_11
    monitor-exit v2

    return-void

    .line 113
    :cond_12
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;)I

    move-result v3

    if-ne v3, v10, :cond_13

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v3, v3, Lcom/tencent/bugly/beta/global/e;->U:Z

    if-nez v3, :cond_14

    :cond_13
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 114
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;)I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_15

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-boolean v3, v3, Lcom/tencent/bugly/beta/global/e;->V:Z

    if-eqz v3, :cond_15

    :cond_14
    if-nez v0, :cond_15

    .line 115
    invoke-direct {p0}, Lcom/tencent/bugly/beta/upgrade/d;->a()V

    .line 116
    monitor-exit v2

    return-void

    :cond_15
    if-nez v1, :cond_18

    .line 117
    invoke-direct/range {p0 .. p1}, Lcom/tencent/bugly/beta/upgrade/d;->b(Z)V

    goto :goto_3

    .line 118
    :cond_16
    iget-object v4, p0, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    if-eqz v4, :cond_17

    .line 119
    new-instance v1, Lcom/tencent/bugly/beta/global/d;

    .line 120
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v4, v6, v9

    aput-object v5, v6, v10

    const/4 v4, 0x2

    aput-object v0, v6, v4

    invoke-direct {v1, v3, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 121
    invoke-static {v1}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_17
    if-eqz v0, :cond_18

    if-nez v1, :cond_18

    .line 122
    new-instance v0, Lcom/tencent/bugly/beta/global/d;

    new-array v1, v10, [Ljava/lang/Object;

    sget-object v3, Lcom/tencent/bugly/beta/Beta;->strToastYourAreTheLatestVersion:Ljava/lang/String;

    aput-object v3, v1, v9

    invoke-direct {v0, v8, v1}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 123
    :cond_18
    :goto_3
    monitor-exit v2

    return-void

    :goto_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method
