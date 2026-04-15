.class public final Landroidx/media3/exoplayer/offline/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:Z

.field public c:Z

.field public final synthetic d:Landroidx/media3/exoplayer/offline/r;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/offline/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/q;->d:Landroidx/media3/exoplayer/offline/r;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/q;->a:Landroid/os/Handler;

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public final a()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/q;->d:Landroidx/media3/exoplayer/offline/r;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/media3/exoplayer/offline/r;->d:Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, v1, Landroidx/media3/exoplayer/offline/DownloadService$DownloadManagerHelper;->b:Landroidx/media3/exoplayer/offline/m;

    .line 11
    .line 12
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/m;->k:Ljava/util/List;

    .line 13
    .line 14
    iget v1, v1, Landroidx/media3/exoplayer/offline/m;->i:I

    .line 15
    .line 16
    iget-object v3, v0, Landroidx/media3/exoplayer/offline/q;->d:Landroidx/media3/exoplayer/offline/r;

    .line 17
    .line 18
    check-cast v3, Lcom/cnl/kikoeru/MusicDownloadService;

    .line 19
    .line 20
    const-string v4, "downloads"

    .line 21
    .line 22
    invoke-static {v2, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lm3/c;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "download_channel"

    .line 32
    .line 33
    invoke-direct {v4, v5, v6}, Lm3/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x0

    .line 43
    const/4 v14, 0x1

    .line 44
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    const/4 v6, 0x2

    .line 49
    if-ge v8, v15, :cond_5

    .line 50
    .line 51
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v15

    .line 55
    check-cast v15, Landroidx/media3/exoplayer/offline/d;

    .line 56
    .line 57
    const/16 v16, 0x1

    .line 58
    .line 59
    iget v7, v15, Landroidx/media3/exoplayer/offline/d;->b:I

    .line 60
    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    if-eq v7, v6, :cond_1

    .line 64
    .line 65
    const/4 v6, 0x5

    .line 66
    if-eq v7, v6, :cond_0

    .line 67
    .line 68
    const/4 v6, 0x7

    .line 69
    if-eq v7, v6, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_0
    const/4 v12, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object v6, v15, Landroidx/media3/exoplayer/offline/d;->h:Landroidx/media3/exoplayer/offline/n;

    .line 75
    .line 76
    iget v6, v6, Landroidx/media3/exoplayer/offline/n;->b:F

    .line 77
    .line 78
    const/high16 v7, -0x40800000    # -1.0f

    .line 79
    .line 80
    cmpl-float v7, v6, v7

    .line 81
    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    add-float/2addr v5, v6

    .line 85
    const/4 v14, 0x0

    .line 86
    :cond_2
    iget-object v6, v15, Landroidx/media3/exoplayer/offline/d;->h:Landroidx/media3/exoplayer/offline/n;

    .line 87
    .line 88
    iget-wide v6, v6, Landroidx/media3/exoplayer/offline/n;->a:J

    .line 89
    .line 90
    const-wide/16 v17, 0x0

    .line 91
    .line 92
    cmp-long v9, v6, v17

    .line 93
    .line 94
    if-lez v9, :cond_3

    .line 95
    .line 96
    const/4 v6, 0x1

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/4 v6, 0x0

    .line 99
    :goto_1
    or-int/2addr v11, v6

    .line 100
    add-int/lit8 v13, v13, 0x1

    .line 101
    .line 102
    const/4 v9, 0x1

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/4 v10, 0x1

    .line 105
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    const/16 v16, 0x1

    .line 109
    .line 110
    if-eqz v9, :cond_6

    .line 111
    .line 112
    const v1, 0x7f0c00ac

    .line 113
    .line 114
    .line 115
    :goto_3
    const/4 v2, 0x1

    .line 116
    goto :goto_5

    .line 117
    :cond_6
    if-eqz v10, :cond_9

    .line 118
    .line 119
    if-eqz v1, :cond_9

    .line 120
    .line 121
    and-int/lit8 v2, v1, 0x2

    .line 122
    .line 123
    if-eqz v2, :cond_7

    .line 124
    .line 125
    const v1, 0x7f0c00b1

    .line 126
    .line 127
    .line 128
    :goto_4
    const/4 v2, 0x0

    .line 129
    goto :goto_5

    .line 130
    :cond_7
    and-int/lit8 v1, v1, 0x1

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    const v1, 0x7f0c00b0

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    const v1, 0x7f0c00af

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    if-eqz v12, :cond_a

    .line 143
    .line 144
    const v1, 0x7f0c00b2

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_a
    const/4 v1, 0x0

    .line 149
    goto :goto_3

    .line 150
    :goto_5
    if-eqz v2, :cond_c

    .line 151
    .line 152
    const/16 v2, 0x64

    .line 153
    .line 154
    if-eqz v9, :cond_b

    .line 155
    .line 156
    int-to-float v7, v13

    .line 157
    div-float/2addr v5, v7

    .line 158
    float-to-int v5, v5

    .line 159
    if-eqz v14, :cond_d

    .line 160
    .line 161
    if-eqz v11, :cond_d

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_b
    const/4 v5, 0x0

    .line 165
    :goto_6
    const/4 v7, 0x1

    .line 166
    goto :goto_7

    .line 167
    :cond_c
    const/4 v2, 0x0

    .line 168
    const/4 v5, 0x0

    .line 169
    :cond_d
    const/4 v7, 0x0

    .line 170
    :goto_7
    iget-object v8, v4, Lm3/c;->u:Landroid/app/Notification;

    .line 171
    .line 172
    const v9, 0x7f050058

    .line 173
    .line 174
    .line 175
    iput v9, v8, Landroid/app/Notification;->icon:I

    .line 176
    .line 177
    const/4 v8, 0x0

    .line 178
    if-nez v1, :cond_e

    .line 179
    .line 180
    move-object v1, v8

    .line 181
    goto :goto_8

    .line 182
    :cond_e
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_8
    invoke-static {v1}, Lm3/c;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iput-object v1, v4, Lm3/c;->e:Ljava/lang/CharSequence;

    .line 195
    .line 196
    iput-object v8, v4, Lm3/c;->g:Landroid/app/PendingIntent;

    .line 197
    .line 198
    invoke-virtual {v4, v8}, Lm3/c;->e(Landroidx/lifecycle/q;)V

    .line 199
    .line 200
    .line 201
    iput v2, v4, Lm3/c;->l:I

    .line 202
    .line 203
    iput v5, v4, Lm3/c;->m:I

    .line 204
    .line 205
    iput-boolean v7, v4, Lm3/c;->n:Z

    .line 206
    .line 207
    const/4 v1, 0x1

    .line 208
    invoke-virtual {v4, v6, v1}, Lm3/c;->c(IZ)V

    .line 209
    .line 210
    .line 211
    const/4 v2, 0x0

    .line 212
    iput-boolean v2, v4, Lm3/c;->i:Z

    .line 213
    .line 214
    sget v2, Lp4/c0;->a:I

    .line 215
    .line 216
    const/16 v3, 0x1f

    .line 217
    .line 218
    if-lt v2, v3, :cond_f

    .line 219
    .line 220
    iput v1, v4, Lm3/c;->s:I

    .line 221
    .line 222
    :cond_f
    invoke-virtual {v4}, Lm3/c;->a()Landroid/app/Notification;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const-string v3, "buildProgressNotification(...)"

    .line 227
    .line 228
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    iget-boolean v3, v0, Landroidx/media3/exoplayer/offline/q;->c:Z

    .line 232
    .line 233
    const v4, 0x1327e

    .line 234
    .line 235
    .line 236
    if-nez v3, :cond_10

    .line 237
    .line 238
    iget-object v3, v0, Landroidx/media3/exoplayer/offline/q;->d:Landroidx/media3/exoplayer/offline/r;

    .line 239
    .line 240
    const-string v5, "dataSync"

    .line 241
    .line 242
    invoke-static {v3, v4, v2, v1, v5}, Lp4/c0;->X(Landroid/app/Service;ILandroid/app/Notification;ILjava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iput-boolean v1, v0, Landroidx/media3/exoplayer/offline/q;->c:Z

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_10
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/q;->d:Landroidx/media3/exoplayer/offline/r;

    .line 249
    .line 250
    const-string v3, "notification"

    .line 251
    .line 252
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, Landroid/app/NotificationManager;

    .line 257
    .line 258
    invoke-virtual {v1, v4, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 259
    .line 260
    .line 261
    :goto_9
    iget-boolean v1, v0, Landroidx/media3/exoplayer/offline/q;->b:Z

    .line 262
    .line 263
    if-eqz v1, :cond_11

    .line 264
    .line 265
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/q;->a:Landroid/os/Handler;

    .line 266
    .line 267
    invoke-virtual {v1, v8}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/q;->a:Landroid/os/Handler;

    .line 271
    .line 272
    new-instance v2, La9/m;

    .line 273
    .line 274
    const/4 v3, 0x2

    .line 275
    invoke-direct {v2, v3, v0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    const-wide/16 v3, 0x3e8

    .line 279
    .line 280
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 281
    .line 282
    .line 283
    :cond_11
    return-void
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
