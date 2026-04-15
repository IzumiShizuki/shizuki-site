.class public abstract Landroidx/media3/exoplayer/offline/r;
.super Landroid/app/Service;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final i:Ljava/util/HashMap;


# instance fields
.field public final a:Landroidx/media3/exoplayer/offline/q;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/offline/r;->i:Ljava/util/HashMap;

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
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/media3/exoplayer/offline/q;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/offline/q;-><init>(Landroidx/media3/exoplayer/offline/r;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 10
    .line 11
    const-string v0, "download_channel"

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/r;->b:Ljava/lang/String;

    .line 14
    .line 15
    const v0, 0x7f0c0032

    .line 16
    .line 17
    .line 18
    iput v0, p0, Landroidx/media3/exoplayer/offline/r;->c:I

    .line 19
    .line 20
    return-void
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

.method public static a(Landroidx/media3/exoplayer/offline/r;Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/media3/exoplayer/offline/d;

    .line 17
    .line 18
    iget v1, v1, Landroidx/media3/exoplayer/offline/d;->b:I

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x7

    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Landroidx/media3/exoplayer/offline/q;->b:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/media3/exoplayer/offline/q;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
    .line 40
    .line 41
    .line 42
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
.end method

.method public static c(Lcom/cnl/kikoeru/MainApplication;Landroidx/media3/exoplayer/offline/o;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lcom/cnl/kikoeru/MusicDownloadService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "foreground"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "download_request"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "stop_reason"

    .line 28
    .line 29
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, Landroidx/media3/exoplayer/offline/q;->b:Z

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/q;->a:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/r;->d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget v0, Lp4/c0;->a:I

    .line 27
    .line 28
    const/16 v1, 0x1c

    .line 29
    .line 30
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Landroidx/media3/exoplayer/offline/r;->g:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/r;->h:Z

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-boolean v0, p0, Landroidx/media3/exoplayer/offline/r;->h:Z

    .line 44
    .line 45
    iget v1, p0, Landroidx/media3/exoplayer/offline/r;->e:I

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopSelfResult(I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    or-int/2addr v0, v1

    .line 52
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/r;->h:Z

    .line 53
    .line 54
    return-void
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

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
    .line 7
    .line 8
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final onCreate()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/r;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v1, Lp4/c0;->a:I

    .line 6
    .line 7
    const/16 v2, 0x1a

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    const-string v1, "notification"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/app/NotificationManager;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lp4/q;->g()V

    .line 23
    .line 24
    .line 25
    iget v2, p0, Landroidx/media3/exoplayer/offline/r;->c:I

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v0, v2}, Lp4/q;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, v0}, Lp4/q;->h(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    sget-object v0, Landroidx/media3/exoplayer/offline/r;->i:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v5, 0x0

    .line 62
    :goto_0
    sget v1, Lp4/c0;->a:I

    .line 63
    .line 64
    const/16 v2, 0x1f

    .line 65
    .line 66
    if-ge v1, v2, :cond_2

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v1, 0x0

    .line 71
    :goto_1
    if-eqz v5, :cond_3

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, Lcom/cnl/kikoeru/MusicDownloadService;

    .line 77
    .line 78
    new-instance v2, Li5/b;

    .line 79
    .line 80
    invoke-direct {v2, v1}, Li5/b;-><init>(Lcom/cnl/kikoeru/MusicDownloadService;)V

    .line 81
    .line 82
    .line 83
    move-object v6, v2

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move-object v6, v8

    .line 86
    :goto_2
    invoke-static {}, Lh9/a;->a()Landroidx/media3/exoplayer/offline/m;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4, v9}, Landroidx/media3/exoplayer/offline/m;->f(Z)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-direct/range {v2 .. v7}, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/offline/m;ZLi5/b;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-object v1, v2

    .line 106
    :cond_4
    iput-object v1, p0, Landroidx/media3/exoplayer/offline/r;->d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 107
    .line 108
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->f:Landroidx/media3/exoplayer/offline/r;

    .line 109
    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    const/4 v9, 0x1

    .line 113
    :cond_5
    invoke-static {v9}, Lp4/c;->i(Z)V

    .line 114
    .line 115
    .line 116
    iput-object p0, v1, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->f:Landroidx/media3/exoplayer/offline/r;

    .line 117
    .line 118
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->b:Landroidx/media3/exoplayer/offline/m;

    .line 119
    .line 120
    iget-boolean v0, v0, Landroidx/media3/exoplayer/offline/m;->g:Z

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    invoke-static {v8}, Lp4/c0;->o(Landroidx/media3/exoplayer/offline/f;)Landroid/os/Handler;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v2, Landroidx/media3/exoplayer/offline/p;

    .line 129
    .line 130
    invoke-direct {v2, v1, p0}, Landroidx/media3/exoplayer/offline/p;-><init>(Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;Landroidx/media3/exoplayer/offline/r;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/r;->d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->f:Landroidx/media3/exoplayer/offline/r;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, v0, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->f:Landroidx/media3/exoplayer/offline/r;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iput-boolean v2, v0, Landroidx/media3/exoplayer/offline/q;->b:Z

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/q;->a:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 12

    .line 1
    iput p3, p0, Landroidx/media3/exoplayer/offline/r;->e:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p0, Landroidx/media3/exoplayer/offline/r;->g:Z

    .line 5
    .line 6
    const-string p3, "androidx.media3.exoplayer.downloadService.action.RESTART"

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "content_id"

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-boolean v4, p0, Landroidx/media3/exoplayer/offline/r;->f:Z

    .line 23
    .line 24
    const-string v5, "foreground"

    .line 25
    .line 26
    invoke-virtual {p1, v5, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v5, 0x0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 42
    :goto_1
    or-int/2addr v4, v5

    .line 43
    iput-boolean v4, p0, Landroidx/media3/exoplayer/offline/r;->f:Z

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object v2, v1

    .line 47
    move-object v3, v2

    .line 48
    :goto_2
    const-string v4, "androidx.media3.exoplayer.downloadService.action.INIT"

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    move-object v2, v4

    .line 53
    :cond_3
    iget-object v5, p0, Landroidx/media3/exoplayer/offline/r;->d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v5, v5, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->b:Landroidx/media3/exoplayer/offline/m;

    .line 59
    .line 60
    iget-object v6, v5, Landroidx/media3/exoplayer/offline/m;->c:Landroidx/media3/exoplayer/offline/j;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    const/16 v8, 0x8

    .line 67
    .line 68
    const/4 v9, 0x7

    .line 69
    const/4 v10, 0x4

    .line 70
    const/4 v11, -0x1

    .line 71
    sparse-switch v7, :sswitch_data_0

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :sswitch_0
    const-string p3, "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS"

    .line 77
    .line 78
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-nez p3, :cond_4

    .line 83
    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :cond_4
    const/16 v11, 0x8

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :sswitch_1
    const-string p3, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS"

    .line 90
    .line 91
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    if-nez p3, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/4 v11, 0x7

    .line 99
    goto :goto_3

    .line 100
    :sswitch_2
    const-string p3, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"

    .line 101
    .line 102
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    if-nez p3, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    const/4 v11, 0x6

    .line 110
    goto :goto_3

    .line 111
    :sswitch_3
    const-string p3, "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"

    .line 112
    .line 113
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-nez p3, :cond_7

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    const/4 v11, 0x5

    .line 121
    goto :goto_3

    .line 122
    :sswitch_4
    const-string p3, "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS"

    .line 123
    .line 124
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-nez p3, :cond_8

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    const/4 v11, 0x4

    .line 132
    goto :goto_3

    .line 133
    :sswitch_5
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-nez p3, :cond_9

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_9
    const/4 v11, 0x3

    .line 141
    goto :goto_3

    .line 142
    :sswitch_6
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-nez p3, :cond_a

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_a
    const/4 v11, 0x2

    .line 150
    goto :goto_3

    .line 151
    :sswitch_7
    const-string p3, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"

    .line 152
    .line 153
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    if-nez p3, :cond_b

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_b
    const/4 v11, 0x1

    .line 161
    goto :goto_3

    .line 162
    :sswitch_8
    const-string p3, "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON"

    .line 163
    .line 164
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-nez p3, :cond_c

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_c
    const/4 v11, 0x0

    .line 172
    :goto_3
    const-string p3, "stop_reason"

    .line 173
    .line 174
    const-string v4, "DownloadService"

    .line 175
    .line 176
    packed-switch v11, :pswitch_data_0

    .line 177
    .line 178
    .line 179
    const-string p1, "Ignored unrecognized action: "

    .line 180
    .line 181
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {v4, p1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :pswitch_0
    invoke-virtual {v5, v0}, Landroidx/media3/exoplayer/offline/m;->f(Z)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_4

    .line 194
    .line 195
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    const-string p3, "requirements"

    .line 199
    .line 200
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    check-cast p1, Li5/c;

    .line 205
    .line 206
    if-nez p1, :cond_d

    .line 207
    .line 208
    const-string p1, "Ignored SET_REQUIREMENTS: Missing requirements extra"

    .line 209
    .line 210
    invoke-static {v4, p1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_4

    .line 214
    .line 215
    :cond_d
    iget-object p3, v5, Landroidx/media3/exoplayer/offline/m;->l:Li5/f;

    .line 216
    .line 217
    iget-object p3, p3, Li5/f;->e:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p3, Li5/c;

    .line 220
    .line 221
    invoke-virtual {p1, p3}, Li5/c;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p3

    .line 225
    if-eqz p3, :cond_e

    .line 226
    .line 227
    goto/16 :goto_4

    .line 228
    .line 229
    :cond_e
    iget-object p3, v5, Landroidx/media3/exoplayer/offline/m;->l:Li5/f;

    .line 230
    .line 231
    iget-object v2, p3, Li5/f;->c:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, Landroid/content/Context;

    .line 234
    .line 235
    iget-object v3, p3, Li5/f;->g:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v3, Lb7/m2;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v3}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 243
    .line 244
    .line 245
    iput-object v1, p3, Li5/f;->g:Ljava/lang/Object;

    .line 246
    .line 247
    sget v3, Lp4/c0;->a:I

    .line 248
    .line 249
    const/16 v4, 0x18

    .line 250
    .line 251
    if-lt v3, v4, :cond_f

    .line 252
    .line 253
    iget-object v3, p3, Li5/f;->h:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v3, Li5/e;

    .line 256
    .line 257
    if-eqz v3, :cond_f

    .line 258
    .line 259
    const-string v3, "connectivity"

    .line 260
    .line 261
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object v3, p3, Li5/f;->h:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v3, Li5/e;

    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 278
    .line 279
    .line 280
    iput-object v1, p3, Li5/f;->h:Ljava/lang/Object;

    .line 281
    .line 282
    :cond_f
    new-instance p3, Li5/f;

    .line 283
    .line 284
    iget-object v1, v5, Landroidx/media3/exoplayer/offline/m;->a:Landroid/content/Context;

    .line 285
    .line 286
    iget-object v2, v5, Landroidx/media3/exoplayer/offline/m;->d:Landroidx/media3/exoplayer/offline/g;

    .line 287
    .line 288
    invoke-direct {p3, v1, v2, p1}, Li5/f;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/offline/g;Li5/c;)V

    .line 289
    .line 290
    .line 291
    iput-object p3, v5, Landroidx/media3/exoplayer/offline/m;->l:Li5/f;

    .line 292
    .line 293
    invoke-virtual {p3}, Li5/f;->b()I

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    iget-object p3, v5, Landroidx/media3/exoplayer/offline/m;->l:Li5/f;

    .line 298
    .line 299
    invoke-virtual {v5, p3, p1}, Landroidx/media3/exoplayer/offline/m;->d(Li5/f;I)V

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    const-string v1, "download_request"

    .line 307
    .line 308
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, Landroidx/media3/exoplayer/offline/o;

    .line 313
    .line 314
    if-nez v1, :cond_10

    .line 315
    .line 316
    const-string p1, "Ignored ADD_DOWNLOAD: Missing download_request extra"

    .line 317
    .line 318
    invoke-static {v4, p1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_10
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    iget p3, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 327
    .line 328
    add-int/2addr p3, v0

    .line 329
    iput p3, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 330
    .line 331
    invoke-virtual {v6, v9, p1, p2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 336
    .line 337
    .line 338
    goto :goto_4

    .line 339
    :pswitch_3
    iget p1, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 340
    .line 341
    add-int/2addr p1, v0

    .line 342
    iput p1, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 343
    .line 344
    const/16 p1, 0x9

    .line 345
    .line 346
    invoke-virtual {v6, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :pswitch_4
    invoke-virtual {v5, p2}, Landroidx/media3/exoplayer/offline/m;->f(Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_4

    .line 358
    :pswitch_5
    if-nez v3, :cond_11

    .line 359
    .line 360
    const-string p1, "Ignored REMOVE_DOWNLOAD: Missing content_id extra"

    .line 361
    .line 362
    invoke-static {v4, p1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_11
    iget p1, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 367
    .line 368
    add-int/2addr p1, v0

    .line 369
    iput p1, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 370
    .line 371
    invoke-virtual {v6, v8, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-nez v1, :cond_12

    .line 387
    .line 388
    const-string p1, "Ignored SET_STOP_REASON: Missing stop_reason extra"

    .line 389
    .line 390
    invoke-static {v4, p1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_12
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 395
    .line 396
    .line 397
    move-result p1

    .line 398
    iget p3, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 399
    .line 400
    add-int/2addr p3, v0

    .line 401
    iput p3, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 402
    .line 403
    invoke-virtual {v6, v10, p1, p2, v3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 408
    .line 409
    .line 410
    :goto_4
    :pswitch_7
    sget p1, Lp4/c0;->a:I

    .line 411
    .line 412
    const/16 p3, 0x1a

    .line 413
    .line 414
    if-lt p1, p3, :cond_13

    .line 415
    .line 416
    iget-boolean p1, p0, Landroidx/media3/exoplayer/offline/r;->f:Z

    .line 417
    .line 418
    if-eqz p1, :cond_13

    .line 419
    .line 420
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/r;->a:Landroidx/media3/exoplayer/offline/q;

    .line 421
    .line 422
    if-eqz p1, :cond_13

    .line 423
    .line 424
    iget-boolean p3, p1, Landroidx/media3/exoplayer/offline/q;->c:Z

    .line 425
    .line 426
    if-nez p3, :cond_13

    .line 427
    .line 428
    invoke-virtual {p1}, Landroidx/media3/exoplayer/offline/q;->a()V

    .line 429
    .line 430
    .line 431
    :cond_13
    iput-boolean p2, p0, Landroidx/media3/exoplayer/offline/r;->h:Z

    .line 432
    .line 433
    iget p1, v5, Landroidx/media3/exoplayer/offline/m;->f:I

    .line 434
    .line 435
    if-nez p1, :cond_14

    .line 436
    .line 437
    iget p1, v5, Landroidx/media3/exoplayer/offline/m;->e:I

    .line 438
    .line 439
    if-nez p1, :cond_14

    .line 440
    .line 441
    invoke-virtual {p0}, Landroidx/media3/exoplayer/offline/r;->b()V

    .line 442
    .line 443
    .line 444
    :cond_14
    return v0

    .line 445
    :sswitch_data_0
    .sparse-switch
        -0x7b47cdc8 -> :sswitch_8
        -0x47112489 -> :sswitch_7
        -0x274df87d -> :sswitch_6
        -0xe367804 -> :sswitch_5
        0x1f2a425 -> :sswitch_4
        0x1bab7dfe -> :sswitch_3
        0x3175ed72 -> :sswitch_2
        0x3267e259 -> :sswitch_1
        0x6815b736 -> :sswitch_0
    .end sparse-switch

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
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
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/media3/exoplayer/offline/r;->g:Z

    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
