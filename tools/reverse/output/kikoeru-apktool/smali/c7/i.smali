.class public final Lc7/i;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:Lc7/e1;


# direct methods
.method public constructor <init>(Lc7/e1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc7/i;->a:Lc7/e1;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final onConnected()V
    .locals 15

    .line 1
    iget-object v0, p0, Lc7/i;->a:Lc7/e1;

    .line 2
    .line 3
    iget-object v1, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lc7/j;

    .line 6
    .line 7
    const-string v2, "token is not a valid MediaSession.Token object"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v1, :cond_6

    .line 13
    .line 14
    const-string v6, "MediaBrowserCompat"

    .line 15
    .line 16
    iget-object v7, v1, Lc7/j;->d:Lb7/y1;

    .line 17
    .line 18
    iget-object v8, v1, Lc7/j;->b:Landroid/media/browse/MediaBrowser;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v8}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 24
    if-nez v9, :cond_0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    const-string v10, "extra_service_version"

    .line 29
    .line 30
    invoke-virtual {v9, v10, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    const-string v10, "extra_messenger"

    .line 34
    .line 35
    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    if-eqz v10, :cond_1

    .line 40
    .line 41
    new-instance v11, Lc7/n;

    .line 42
    .line 43
    iget-object v12, v1, Lc7/j;->c:Landroid/os/Bundle;

    .line 44
    .line 45
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v13, Landroid/os/Messenger;

    .line 49
    .line 50
    invoke-direct {v13, v10}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 51
    .line 52
    .line 53
    iput-object v13, v11, Lc7/n;->a:Landroid/os/Messenger;

    .line 54
    .line 55
    iput-object v11, v1, Lc7/j;->f:Lc7/n;

    .line 56
    .line 57
    new-instance v10, Landroid/os/Messenger;

    .line 58
    .line 59
    invoke-direct {v10, v7}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 60
    .line 61
    .line 62
    iput-object v10, v1, Lc7/j;->g:Landroid/os/Messenger;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-direct {v13, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v13, v7, Lb7/y1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    :try_start_1
    iget-object v7, v1, Lc7/j;->a:Landroid/content/Context;

    .line 75
    .line 76
    new-instance v13, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v14, "data_package_name"

    .line 82
    .line 83
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v13, v14, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v7, "data_calling_pid"

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    invoke-virtual {v13, v7, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    const-string v7, "data_root_hints"

    .line 100
    .line 101
    invoke-virtual {v13, v7, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    const/4 v7, 0x6

    .line 105
    invoke-virtual {v11, v7, v13, v10}, Lc7/n;->c(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catch_0
    const-string v7, "Remote error registering client messenger."

    .line 110
    .line 111
    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    :cond_1
    :goto_0
    const-string v6, "extra_session_binder"

    .line 115
    .line 116
    invoke-virtual {v9, v6}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    sget v7, Lc7/v0;->f:I

    .line 121
    .line 122
    if-nez v6, :cond_2

    .line 123
    .line 124
    move-object v7, v4

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    const-string v7, "android.support.v4.media.session.IMediaSession"

    .line 127
    .line 128
    invoke-interface {v6, v7}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-eqz v7, :cond_3

    .line 133
    .line 134
    instance-of v9, v7, Lc7/h;

    .line 135
    .line 136
    if-eqz v9, :cond_3

    .line 137
    .line 138
    check-cast v7, Lc7/h;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    new-instance v7, Lc7/g;

    .line 142
    .line 143
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v6, v7, Lc7/g;->e:Landroid/os/IBinder;

    .line 147
    .line 148
    :goto_1
    if-eqz v7, :cond_6

    .line 149
    .line 150
    invoke-virtual {v8}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-eqz v6, :cond_4

    .line 155
    .line 156
    const/4 v8, 0x1

    .line 157
    goto :goto_2

    .line 158
    :cond_4
    const/4 v8, 0x0

    .line 159
    :goto_2
    invoke-static {v8}, Lp4/c;->i(Z)V

    .line 160
    .line 161
    .line 162
    invoke-static {v6}, Lq/t0;->M(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_5

    .line 167
    .line 168
    new-instance v8, Lc7/d1;

    .line 169
    .line 170
    invoke-direct {v8, v6, v7}, Lc7/d1;-><init>(Ljava/lang/Object;Lc7/h;)V

    .line 171
    .line 172
    .line 173
    iput-object v8, v1, Lc7/j;->h:Lc7/d1;

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :catch_1
    move-exception v1

    .line 183
    const-string v7, "Unexpected IllegalStateException"

    .line 184
    .line 185
    invoke-static {v6, v7, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 186
    .line 187
    .line 188
    :cond_6
    :goto_3
    iget-object v0, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lb7/d1;

    .line 191
    .line 192
    iget-object v1, v0, Lb7/d1;->i:Lc7/o;

    .line 193
    .line 194
    if-eqz v1, :cond_a

    .line 195
    .line 196
    iget-object v1, v1, Lc7/o;->a:Lc7/j;

    .line 197
    .line 198
    iget-object v6, v1, Lc7/j;->h:Lc7/d1;

    .line 199
    .line 200
    if-nez v6, :cond_9

    .line 201
    .line 202
    iget-object v6, v1, Lc7/j;->b:Landroid/media/browse/MediaBrowser;

    .line 203
    .line 204
    invoke-virtual {v6}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    if-eqz v6, :cond_7

    .line 209
    .line 210
    const/4 v7, 0x1

    .line 211
    goto :goto_4

    .line 212
    :cond_7
    const/4 v7, 0x0

    .line 213
    :goto_4
    invoke-static {v7}, Lp4/c;->i(Z)V

    .line 214
    .line 215
    .line 216
    invoke-static {v6}, Lq/t0;->M(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-eqz v7, :cond_8

    .line 221
    .line 222
    new-instance v2, Lc7/d1;

    .line 223
    .line 224
    invoke-direct {v2, v6, v4}, Lc7/d1;-><init>(Ljava/lang/Object;Lc7/h;)V

    .line 225
    .line 226
    .line 227
    iput-object v2, v1, Lc7/j;->h:Lc7/d1;

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 231
    .line 232
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_9
    :goto_5
    iget-object v1, v1, Lc7/j;->h:Lc7/d1;

    .line 237
    .line 238
    iget-object v2, v0, Lb7/d1;->b:Lb7/d0;

    .line 239
    .line 240
    new-instance v4, Lb5/h;

    .line 241
    .line 242
    invoke-direct {v4, v3, v0, v1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4}, Lb7/d0;->e(Ljava/lang/Runnable;)V

    .line 246
    .line 247
    .line 248
    iget-object v1, v2, Lb7/d0;->d:Landroid/os/Handler;

    .line 249
    .line 250
    new-instance v2, Lb7/x0;

    .line 251
    .line 252
    invoke-direct {v2, v0, v5}, Lb7/x0;-><init>(Lb7/d1;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 256
    .line 257
    .line 258
    :cond_a
    return-void
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

.method public final onConnectionFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc7/i;->a:Lc7/e1;

    .line 2
    .line 3
    iget-object v0, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb7/d1;

    .line 6
    .line 7
    iget-object v0, v0, Lb7/d1;->b:Lb7/d0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lb7/d0;->d()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final onConnectionSuspended()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc7/i;->a:Lc7/e1;

    .line 2
    .line 3
    iget-object v1, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lc7/j;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, Lc7/j;->f:Lc7/n;

    .line 11
    .line 12
    iput-object v2, v1, Lc7/j;->g:Landroid/os/Messenger;

    .line 13
    .line 14
    iput-object v2, v1, Lc7/j;->h:Lc7/d1;

    .line 15
    .line 16
    iget-object v1, v1, Lc7/j;->d:Lb7/y1;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v3, v1, Lb7/y1;->c:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_0
    iget-object v0, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lb7/d1;

    .line 31
    .line 32
    iget-object v0, v0, Lb7/d1;->b:Lb7/d0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lb7/d0;->d()V

    .line 35
    .line 36
    .line 37
    return-void
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
