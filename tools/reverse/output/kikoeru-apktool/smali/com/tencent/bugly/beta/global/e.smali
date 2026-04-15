.class public Lcom/tencent/bugly/beta/global/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static a:I

.field public static b:Lcom/tencent/bugly/beta/global/e;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Landroid/content/pm/PackageInfo;

.field public D:Landroid/content/SharedPreferences;

.field public E:Landroid/util/DisplayMetrics;

.field public F:Z

.field public G:Z

.field public H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

.field public I:Ljava/io/File;

.field public J:Ljava/io/File;

.field public K:Ljava/io/File;

.field public L:Ljava/lang/String;

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;

.field public P:Z

.field public Q:I

.field public R:Ljava/lang/String;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

.field public Z:Z

.field public aa:Z

.field public ba:Z

.field public c:J

.field public final ca:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:J

.field public da:Z

.field public e:Z

.field public ea:Z

.field public f:Z

.field public fa:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Lcom/tencent/bugly/beta/ui/UILifecycleListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/bugly/beta/ui/UILifecycleListener<",
            "Lcom/tencent/bugly/beta/UpgradeInfo;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/io/File;

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field public r:I

.field public s:Lcom/tencent/bugly/beta/download/c;

.field public t:Lcom/tencent/bugly/beta/download/DownloadListener;

.field public u:Ljava/io/File;

.field public v:Landroid/content/Context;

.field public w:Ljava/io/File;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/beta/global/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/bugly/beta/global/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

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
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xbb8

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/bugly/beta/global/e;->c:J

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/tencent/bugly/beta/global/e;->d:J

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->e:Z

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->f:Z

    .line 17
    .line 18
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->g:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->h:Z

    .line 21
    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->p:Ljava/util/List;

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->q:Ljava/util/List;

    .line 35
    .line 36
    const/high16 v2, -0x80000000

    .line 37
    .line 38
    iput v2, p0, Lcom/tencent/bugly/beta/global/e;->z:I

    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->A:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->B:Ljava/lang/String;

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->F:Z

    .line 47
    .line 48
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->G:Z

    .line 49
    .line 50
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->L:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->M:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->N:Ljava/lang/String;

    .line 55
    .line 56
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->O:Ljava/lang/String;

    .line 57
    .line 58
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->P:Z

    .line 59
    .line 60
    iput v1, p0, Lcom/tencent/bugly/beta/global/e;->Q:I

    .line 61
    .line 62
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->R:Ljava/lang/String;

    .line 63
    .line 64
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->S:Z

    .line 65
    .line 66
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->T:Z

    .line 67
    .line 68
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->U:Z

    .line 69
    .line 70
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->V:Z

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->W:Z

    .line 73
    .line 74
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->X:Z

    .line 75
    .line 76
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->Z:Z

    .line 77
    .line 78
    iput-boolean v0, p0, Lcom/tencent/bugly/beta/global/e;->aa:Z

    .line 79
    .line 80
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->ba:Z

    .line 81
    .line 82
    new-instance v0, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/tencent/bugly/beta/global/e;->ca:Ljava/util/List;

    .line 88
    .line 89
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->da:Z

    .line 90
    .line 91
    iput-boolean v1, p0, Lcom/tencent/bugly/beta/global/e;->ea:Z

    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, v0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/16 v2, 0x4000

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->C:Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    iget v2, p0, Lcom/tencent/bugly/beta/global/e;->z:I

    .line 31
    .line 32
    const/high16 v3, -0x80000000

    .line 33
    .line 34
    if-ne v2, v3, :cond_0

    .line 35
    .line 36
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 37
    .line 38
    iput v1, p0, Lcom/tencent/bugly/beta/global/e;->z:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :catch_0
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->A:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->C:Landroid/content/pm/PackageInfo;

    .line 55
    .line 56
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->A:Ljava/lang/String;

    .line 59
    .line 60
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->C:Landroid/content/pm/PackageInfo;

    .line 61
    .line 62
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->B:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->R:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    :try_start_2
    const-string v2, "BUGLY_CHANNEL"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    :try_start_3
    invoke-static {v1, v2}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->R:Ljava/lang/String;

    .line 89
    .line 90
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    .line 92
    :try_start_4
    const-string v2, "BUGLY_APP_BUILD_NO"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    .line 94
    :try_start_5
    invoke-static {v1, v2}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_3

    .line 103
    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, p0, Lcom/tencent/bugly/beta/global/e;->r:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :goto_1
    :try_start_6
    invoke-static {v1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_3

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_2
    const-string v1, "window"

    .line 121
    .line 122
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Landroid/view/WindowManager;

    .line 127
    .line 128
    new-instance v2, Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->E:Landroid/util/DisplayMetrics;

    .line 134
    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-eqz v2, :cond_4

    .line 142
    .line 143
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget-object v2, p0, Lcom/tencent/bugly/beta/global/e;->E:Landroid/util/DisplayMetrics;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    iget-object v2, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v2, "/.beta/"

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v2, "/apk/"

    .line 172
    .line 173
    const-string v3, "/res/"

    .line 174
    .line 175
    iget-object v4, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 176
    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-nez v4, :cond_5

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    new-instance v4, Ljava/io/File;

    .line 187
    .line 188
    iget-object v5, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 189
    .line 190
    new-instance v6, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-direct {v4, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iput-object v4, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 213
    .line 214
    new-instance v2, Ljava/io/File;

    .line 215
    .line 216
    iget-object v4, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 217
    .line 218
    new-instance v5, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-direct {v2, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iput-object v2, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_6
    :goto_3
    new-instance v4, Ljava/io/File;

    .line 244
    .line 245
    sget-object v5, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v5}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-direct {v4, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iput-object v4, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 259
    .line 260
    new-instance v1, Ljava/io/File;

    .line 261
    .line 262
    iget-object v4, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 263
    .line 264
    invoke-direct {v1, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 268
    .line 269
    new-instance v1, Ljava/io/File;

    .line 270
    .line 271
    iget-object v2, p0, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 272
    .line 273
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iput-object v1, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 277
    .line 278
    :goto_4
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->C:Landroid/content/pm/PackageInfo;

    .line 279
    .line 280
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 281
    .line 282
    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 283
    .line 284
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    const/4 v1, 0x2

    .line 289
    const/4 v2, 0x0

    .line 290
    if-nez v0, :cond_8

    .line 291
    .line 292
    const-string v0, "mounted"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 293
    .line 294
    :try_start_7
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_8

    .line 303
    .line 304
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_7

    .line 311
    .line 312
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :catch_1
    move-exception v0

    .line 322
    goto :goto_6

    .line 323
    :cond_7
    :goto_5
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_a

    .line 330
    .line 331
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_a

    .line 338
    .line 339
    :cond_8
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 340
    .line 341
    :try_start_8
    const-string v3, "apk"
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 342
    .line 343
    :try_start_9
    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iput-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 348
    .line 349
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 350
    .line 351
    :try_start_a
    const-string v3, "res"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 352
    .line 353
    :try_start_b
    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iput-object v0, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 358
    .line 359
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 360
    .line 361
    if-eqz v0, :cond_9

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_9

    .line 368
    .line 369
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 370
    .line 371
    if-eqz v0, :cond_9

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-nez v0, :cond_a

    .line 378
    .line 379
    :cond_9
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 380
    .line 381
    :try_start_c
    const-string v3, "apk"
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 382
    .line 383
    :try_start_d
    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iput-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 388
    .line 389
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 390
    .line 391
    :try_start_e
    const-string v3, "res"
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 392
    .line 393
    :try_start_f
    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    iput-object v0, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :goto_6
    :try_start_10
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-nez v3, :cond_a

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 407
    .line 408
    .line 409
    :cond_a
    :goto_7
    iget-object v0, p0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iget-object v3, p0, Lcom/tencent/bugly/beta/global/e;->u:Ljava/io/File;

    .line 416
    .line 417
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    new-array v1, v1, [Ljava/lang/Object;

    .line 422
    .line 423
    aput-object v0, v1, v2

    .line 424
    .line 425
    const/4 v0, 0x1

    .line 426
    aput-object v3, v1, v0

    .line 427
    .line 428
    const-string v3, "apkSaveDir: %s, resSaveDir: %s"

    .line 429
    .line 430
    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    new-instance v1, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string p1, ".BETA_VALUES"

    .line 446
    .line 447
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    iget-object v1, p0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 455
    .line 456
    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    iput-object p1, p0, Lcom/tencent/bugly/beta/global/e;->D:Landroid/content/SharedPreferences;

    .line 461
    .line 462
    const-string p1, "isFirstRun"

    .line 463
    .line 464
    invoke-static {p1, v0}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    iput-boolean p1, p0, Lcom/tencent/bugly/beta/global/e;->F:Z

    .line 469
    .line 470
    if-eqz p1, :cond_b

    .line 471
    .line 472
    const-string p1, "isFirstRun"

    .line 473
    .line 474
    invoke-static {p1, v2}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 475
    .line 476
    .line 477
    :cond_b
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    if-eqz p1, :cond_c

    .line 482
    .line 483
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/info/a;->oa:Z

    .line 488
    .line 489
    iput-boolean p1, p0, Lcom/tencent/bugly/beta/global/e;->S:Z

    .line 490
    .line 491
    :cond_c
    sget-object p1, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 492
    .line 493
    const-string v0, "us.bch"

    .line 494
    .line 495
    invoke-static {v0, p1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    check-cast p1, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    .line 500
    .line 501
    iput-object p1, p0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    .line 502
    .line 503
    if-nez p1, :cond_d

    .line 504
    .line 505
    new-instance p1, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    .line 506
    .line 507
    invoke-direct {p1}, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;-><init>()V

    .line 508
    .line 509
    .line 510
    iput-object p1, p0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 511
    .line 512
    :cond_d
    monitor-exit p0

    .line 513
    return-void

    .line 514
    :goto_8
    :try_start_11
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 515
    throw p1
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
