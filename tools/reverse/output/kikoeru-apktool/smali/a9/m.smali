.class public final synthetic La9/m;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La9/m;->a:I

    iput-object p2, p0, La9/m;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv4/c0;Lv4/x0;)V
    .locals 0

    .line 2
    const/16 p1, 0x16

    iput p1, p0, La9/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La9/m;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, La9/m;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc4/t;

    .line 4
    .line 5
    const-string v1, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v2, v0, Lc4/t;->d:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v3, v0, Lc4/t;->h:Landroid/support/v4/media/session/b;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    monitor-exit v2

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {v0}, Lc4/t;->d()Ls3/f;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget v3, v2, Ls3/f;->f:I

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Lc4/t;->d:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit v4

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catchall_2
    move-exception v1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    :goto_0
    if-nez v3, :cond_4

    .line 41
    .line 42
    :try_start_4
    const-string v1, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 43
    .line 44
    sget v3, Lr3/a;->a:I

    .line 45
    .line 46
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Lc4/t;->c:Lpe/d;

    .line 50
    .line 51
    iget-object v3, v0, Lc4/t;->a:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    new-array v1, v1, [Ls3/f;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    aput-object v2, v1, v4

    .line 61
    .line 62
    sget-object v4, Lp3/e;->a:Ln7/e;

    .line 63
    .line 64
    const-string v4, "TypefaceCompat.createFromFontInfo"

    .line 65
    .line 66
    invoke-static {v4}, La/a;->t(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 67
    .line 68
    .line 69
    :try_start_5
    sget-object v4, Lp3/e;->a:Ln7/e;

    .line 70
    .line 71
    invoke-virtual {v4, v3, v1}, Ln7/e;->i(Landroid/content/Context;[Ls3/f;)Landroid/graphics/Typeface;

    .line 72
    .line 73
    .line 74
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 75
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 76
    .line 77
    .line 78
    iget-object v3, v0, Lc4/t;->a:Landroid/content/Context;

    .line 79
    .line 80
    iget-object v2, v2, Ls3/f;->a:Landroid/net/Uri;

    .line 81
    .line 82
    invoke-static {v3, v2}, Lu3/x0;->x(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    :try_start_7
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 91
    .line 92
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lb0/w1;

    .line 96
    .line 97
    invoke-static {v2}, Lgh/g;->L(Ljava/nio/MappedByteBuffer;)Ld4/b;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {v3, v1, v2}, Lb0/w1;-><init>(Landroid/graphics/Typeface;Ld4/b;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 102
    .line 103
    .line 104
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 105
    .line 106
    .line 107
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 108
    .line 109
    .line 110
    iget-object v1, v0, Lc4/t;->d:Ljava/lang/Object;

    .line 111
    .line 112
    monitor-enter v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 113
    :try_start_a
    iget-object v2, v0, Lc4/t;->h:Landroid/support/v4/media/session/b;

    .line 114
    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Landroid/support/v4/media/session/b;->O(Lb0/w1;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :catchall_3
    move-exception v2

    .line 122
    goto :goto_2

    .line 123
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 124
    :try_start_b
    invoke-virtual {v0}, Lc4/t;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 129
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 130
    :catchall_4
    move-exception v1

    .line 131
    :try_start_e
    sget v2, Lr3/a;->a:I

    .line 132
    .line 133
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    .line 138
    .line 139
    const-string v2, "Unable to open file."

    .line 140
    .line 141
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :catchall_5
    move-exception v1

    .line 146
    goto :goto_3

    .line 147
    :catchall_6
    move-exception v1

    .line 148
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 149
    .line 150
    .line 151
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 152
    :goto_3
    :try_start_f
    sget v2, Lr3/a;->a:I

    .line 153
    .line 154
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 159
    .line 160
    new-instance v4, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v1, ")"

    .line 169
    .line 170
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 181
    :goto_4
    iget-object v3, v0, Lc4/t;->d:Ljava/lang/Object;

    .line 182
    .line 183
    monitor-enter v3

    .line 184
    :try_start_10
    iget-object v2, v0, Lc4/t;->h:Landroid/support/v4/media/session/b;

    .line 185
    .line 186
    if-eqz v2, :cond_5

    .line 187
    .line 188
    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/b;->N(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :catchall_7
    move-exception v0

    .line 193
    goto :goto_6

    .line 194
    :cond_5
    :goto_5
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 195
    invoke-virtual {v0}, Lc4/t;->b()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :goto_6
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 200
    throw v0

    .line 201
    :goto_7
    :try_start_12
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 202
    throw v0
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

.method private final b()V
    .locals 7

    .line 1
    iget-object v0, p0, La9/m;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/f;

    .line 4
    .line 5
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lg5/f;->m:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v2, v0, Lg5/f;->l:J

    .line 17
    .line 18
    const-wide/16 v4, 0x1

    .line 19
    .line 20
    sub-long/2addr v2, v4

    .line 21
    iput-wide v2, v0, Lg5/f;->l:J

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long v6, v2, v4

    .line 26
    .line 27
    if-lez v6, :cond_1

    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return-void

    .line 31
    :cond_1
    if-gez v6, :cond_2

    .line 32
    .line 33
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lg5/f;->b(Ljava/lang/IllegalStateException;)V

    .line 39
    .line 40
    .line 41
    monitor-exit v1

    .line 42
    return-void

    .line 43
    :cond_2
    invoke-virtual {v0}, Lg5/f;->a()V

    .line 44
    .line 45
    .line 46
    monitor-exit v1

    .line 47
    return-void

    .line 48
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v0
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

.method private final c()V
    .locals 5

    .line 1
    iget-object v0, p0, La9/m;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv4/x0;

    .line 4
    .line 5
    :try_start_0
    monitor-enter v0

    .line 6
    monitor-exit v0
    :try_end_0
    .catch Lv4/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_1
    iget-object v2, v0, Lv4/x0;->a:Lv4/w0;

    .line 9
    .line 10
    iget v3, v0, Lv4/x0;->c:I

    .line 11
    .line 12
    iget-object v4, v0, Lv4/x0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {v2, v3, v4}, Lv4/w0;->d(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_2
    invoke-virtual {v0, v1}, Lv4/x0;->a(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v2

    .line 22
    invoke-virtual {v0, v1}, Lv4/x0;->a(Z)V

    .line 23
    .line 24
    .line 25
    throw v2
    :try_end_2
    .catch Lv4/m; {:try_start_2 .. :try_end_2} :catch_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const-string v1, "ExoPlayerImplInternal"

    .line 28
    .line 29
    const-string v2, "Unexpected error delivering message on external thread."

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw v1
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


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La9/m;->a:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ly2/b0;

    .line 15
    .line 16
    iget-object v6, v0, Ly2/b0;->b:Ltc/b0;

    .line 17
    .line 18
    iput-object v4, v0, Ly2/b0;->n:La9/m;

    .line 19
    .line 20
    iget-object v7, v0, Ly2/b0;->m:Lz0/e;

    .line 21
    .line 22
    iget-object v0, v0, Ly2/b0;->a:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-nez v8, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ne v0, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v7}, Lz0/e;->g()V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_0
    iget-object v0, v7, Lz0/e;->a:[Ljava/lang/Object;

    .line 52
    .line 53
    iget v8, v7, Lz0/e;->c:I

    .line 54
    .line 55
    move-object v9, v4

    .line 56
    const/4 v10, 0x0

    .line 57
    :goto_0
    if-ge v10, v8, :cond_7

    .line 58
    .line 59
    aget-object v11, v0, v10

    .line 60
    .line 61
    check-cast v11, Ly2/a0;

    .line 62
    .line 63
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-eqz v12, :cond_5

    .line 68
    .line 69
    if-eq v12, v5, :cond_4

    .line 70
    .line 71
    if-eq v12, v2, :cond_2

    .line 72
    .line 73
    const/4 v13, 0x3

    .line 74
    if-ne v12, v13, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    new-instance v0, Lce/j0;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_2
    :goto_1
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {v4, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-nez v12, :cond_6

    .line 90
    .line 91
    sget-object v9, Ly2/a0;->c:Ly2/a0;

    .line 92
    .line 93
    if-ne v11, v9, :cond_3

    .line 94
    .line 95
    const/4 v9, 0x1

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    const/4 v9, 0x0

    .line 98
    :goto_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    :goto_3
    move-object v9, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_5
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    invoke-virtual {v7}, Lz0/e;->g()V

    .line 114
    .line 115
    .line 116
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-static {v4, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    iget-object v0, v6, Ltc/b0;->c:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 131
    .line 132
    iget-object v2, v6, Ltc/b0;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Landroid/view/View;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    if-eqz v9, :cond_a

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    iget-object v0, v6, Ltc/b0;->d:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lr/y1;

    .line 150
    .line 151
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lr/y1;

    .line 154
    .line 155
    invoke-virtual {v0}, Lr/y1;->h0()V

    .line 156
    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_9
    iget-object v0, v6, Ltc/b0;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Lr/y1;

    .line 162
    .line 163
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lr/y1;

    .line 166
    .line 167
    invoke-virtual {v0}, Lr/y1;->Z()V

    .line 168
    .line 169
    .line 170
    :cond_a
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v4, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_b

    .line 177
    .line 178
    iget-object v0, v6, Ltc/b0;->c:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 185
    .line 186
    iget-object v2, v6, Ltc/b0;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, Landroid/view/View;

    .line 189
    .line 190
    invoke-virtual {v0, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    :cond_b
    :goto_6
    return-void

    .line 194
    :pswitch_0
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lx4/v;

    .line 197
    .line 198
    iget-wide v2, v0, Lx4/v;->h0:J

    .line 199
    .line 200
    const-wide/32 v6, 0x493e0

    .line 201
    .line 202
    .line 203
    cmp-long v4, v2, v6

    .line 204
    .line 205
    if-ltz v4, :cond_c

    .line 206
    .line 207
    iget-object v2, v0, Lx4/v;->r:Lr/y1;

    .line 208
    .line 209
    iget-object v2, v2, Lr/y1;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Lx4/x;

    .line 212
    .line 213
    iput-boolean v5, v2, Lx4/x;->e1:Z

    .line 214
    .line 215
    const-wide/16 v2, 0x0

    .line 216
    .line 217
    iput-wide v2, v0, Lx4/v;->h0:J

    .line 218
    .line 219
    :cond_c
    return-void

    .line 220
    :pswitch_1
    invoke-direct {v1}, La9/m;->c()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_2
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Landroid/view/View;

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const-string v4, "input_method"

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 239
    .line 240
    invoke-virtual {v2, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_3
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lu0/i;

    .line 247
    .line 248
    invoke-static {v0}, Lu0/i;->a(Lu0/i;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_4
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Lq5/k;

    .line 255
    .line 256
    iget-object v2, v0, Lq5/k;->h:Landroid/view/Surface;

    .line 257
    .line 258
    if-eqz v2, :cond_d

    .line 259
    .line 260
    iget-object v3, v0, Lq5/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_d

    .line 271
    .line 272
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    check-cast v5, Lv4/s;

    .line 277
    .line 278
    iget-object v5, v5, Lv4/s;->a:Lv4/v;

    .line 279
    .line 280
    invoke-virtual {v5, v4}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 281
    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_d
    iget-object v3, v0, Lq5/k;->g:Landroid/graphics/SurfaceTexture;

    .line 285
    .line 286
    if-eqz v3, :cond_e

    .line 287
    .line 288
    invoke-virtual {v3}, Landroid/graphics/SurfaceTexture;->release()V

    .line 289
    .line 290
    .line 291
    :cond_e
    if-eqz v2, :cond_f

    .line 292
    .line 293
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 294
    .line 295
    .line 296
    :cond_f
    iput-object v4, v0, Lq5/k;->g:Landroid/graphics/SurfaceTexture;

    .line 297
    .line 298
    iput-object v4, v0, Lq5/k;->h:Landroid/view/Surface;

    .line 299
    .line 300
    return-void

    .line 301
    :pswitch_5
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Ll1/c;

    .line 304
    .line 305
    invoke-virtual {v0}, Ll1/c;->e()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    iget-object v6, v0, Ll1/c;->a:Lj2/v;

    .line 310
    .line 311
    if-nez v4, :cond_10

    .line 312
    .line 313
    goto/16 :goto_c

    .line 314
    .line 315
    :cond_10
    const-string v4, "ContentCapture:changeChecker"

    .line 316
    .line 317
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :try_start_0
    invoke-virtual {v6, v5}, Lj2/v;->y(Z)V

    .line 321
    .line 322
    .line 323
    iget-object v4, v0, Ll1/c;->l:Lo/y;

    .line 324
    .line 325
    iget-object v5, v4, Lo/m;->b:[I

    .line 326
    .line 327
    iget-object v4, v4, Lo/m;->a:[J

    .line 328
    .line 329
    array-length v7, v4

    .line 330
    sub-int/2addr v7, v2

    .line 331
    if-ltz v7, :cond_14

    .line 332
    .line 333
    const/4 v2, 0x0

    .line 334
    :goto_8
    aget-wide v8, v4, v2

    .line 335
    .line 336
    not-long v10, v8

    .line 337
    const/4 v12, 0x7

    .line 338
    shl-long/2addr v10, v12

    .line 339
    and-long/2addr v10, v8

    .line 340
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    and-long/2addr v10, v12

    .line 346
    cmp-long v14, v10, v12

    .line 347
    .line 348
    if-eqz v14, :cond_13

    .line 349
    .line 350
    sub-int v10, v2, v7

    .line 351
    .line 352
    not-int v10, v10

    .line 353
    ushr-int/lit8 v10, v10, 0x1f

    .line 354
    .line 355
    const/16 v11, 0x8

    .line 356
    .line 357
    rsub-int/lit8 v10, v10, 0x8

    .line 358
    .line 359
    const/4 v12, 0x0

    .line 360
    :goto_9
    if-ge v12, v10, :cond_12

    .line 361
    .line 362
    const-wide/16 v13, 0xff

    .line 363
    .line 364
    and-long/2addr v13, v8

    .line 365
    const-wide/16 v15, 0x80

    .line 366
    .line 367
    cmp-long v17, v13, v15

    .line 368
    .line 369
    if-gez v17, :cond_11

    .line 370
    .line 371
    shl-int/lit8 v13, v2, 0x3

    .line 372
    .line 373
    add-int/2addr v13, v12

    .line 374
    aget v15, v5, v13

    .line 375
    .line 376
    invoke-virtual {v0}, Ll1/c;->d()Lo/m;

    .line 377
    .line 378
    .line 379
    move-result-object v13

    .line 380
    invoke-virtual {v13, v15}, Lo/m;->a(I)Z

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    if-nez v13, :cond_11

    .line 385
    .line 386
    iget-object v13, v0, Ll1/c;->d:Ljava/util/ArrayList;

    .line 387
    .line 388
    new-instance v14, Ll1/d;

    .line 389
    .line 390
    move-object/from16 v20, v4

    .line 391
    .line 392
    iget-wide v3, v0, Ll1/c;->k:J

    .line 393
    .line 394
    sget-object v18, Ll1/e;->b:Ll1/e;

    .line 395
    .line 396
    const/16 v19, 0x0

    .line 397
    .line 398
    move-wide/from16 v16, v3

    .line 399
    .line 400
    invoke-direct/range {v14 .. v19}, Ll1/d;-><init>(IJLl1/e;Lb1/e;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    iget-object v3, v0, Ll1/c;->h:Lkf/f;

    .line 407
    .line 408
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 409
    .line 410
    invoke-interface {v3, v4}, Lkf/u;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_11
    move-object/from16 v20, v4

    .line 415
    .line 416
    :goto_a
    shr-long/2addr v8, v11

    .line 417
    add-int/lit8 v12, v12, 0x1

    .line 418
    .line 419
    move-object/from16 v4, v20

    .line 420
    .line 421
    const/4 v3, 0x0

    .line 422
    goto :goto_9

    .line 423
    :cond_12
    move-object/from16 v20, v4

    .line 424
    .line 425
    if-ne v10, v11, :cond_14

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_13
    move-object/from16 v20, v4

    .line 429
    .line 430
    :goto_b
    if-eq v2, v7, :cond_14

    .line 431
    .line 432
    add-int/lit8 v2, v2, 0x1

    .line 433
    .line 434
    move-object/from16 v4, v20

    .line 435
    .line 436
    const/4 v3, 0x0

    .line 437
    goto :goto_8

    .line 438
    :cond_14
    const-string v2, "ContentCapture:sendAppearEvents"

    .line 439
    .line 440
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 441
    .line 442
    .line 443
    :try_start_1
    invoke-virtual {v6}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-virtual {v2}, Lq2/q;->a()Lq2/o;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    iget-object v3, v0, Ll1/c;->m:Lj2/t2;

    .line 452
    .line 453
    invoke-virtual {v0, v2, v3}, Ll1/c;->h(Lq2/o;Lj2/t2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 454
    .line 455
    .line 456
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Ll1/c;->d()Lo/m;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v0, v2}, Ll1/c;->c(Lo/m;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ll1/c;->p()V

    .line 467
    .line 468
    .line 469
    const/4 v2, 0x0

    .line 470
    iput-boolean v2, v0, Ll1/c;->n:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 471
    .line 472
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 473
    .line 474
    .line 475
    :goto_c
    return-void

    .line 476
    :catchall_0
    move-exception v0

    .line 477
    goto :goto_d

    .line 478
    :catchall_1
    move-exception v0

    .line 479
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 480
    .line 481
    .line 482
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 483
    :goto_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 484
    .line 485
    .line 486
    throw v0

    .line 487
    :pswitch_6
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, Lj2/d0;

    .line 490
    .line 491
    const-string v2, "measureAndLayout"

    .line 492
    .line 493
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    :try_start_4
    iget-object v2, v0, Lj2/d0;->d:Lj2/v;

    .line 497
    .line 498
    invoke-virtual {v2, v5}, Lj2/v;->y(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 499
    .line 500
    .line 501
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 502
    .line 503
    .line 504
    const-string v2, "checkForSemanticsChanges"

    .line 505
    .line 506
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    :try_start_5
    invoke-virtual {v0}, Lj2/d0;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 510
    .line 511
    .line 512
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 513
    .line 514
    .line 515
    const/4 v2, 0x0

    .line 516
    iput-boolean v2, v0, Lj2/d0;->L:Z

    .line 517
    .line 518
    return-void

    .line 519
    :catchall_2
    move-exception v0

    .line 520
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 521
    .line 522
    .line 523
    throw v0

    .line 524
    :catchall_3
    move-exception v0

    .line 525
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 526
    .line 527
    .line 528
    throw v0

    .line 529
    :pswitch_7
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, Lb0/d0;

    .line 532
    .line 533
    const-string v2, "AndroidOwner:outOfFrameExecutor"

    .line 534
    .line 535
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :try_start_6
    invoke-virtual {v0}, Lb0/d0;->b()Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 539
    .line 540
    .line 541
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :catchall_4
    move-exception v0

    .line 546
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 547
    .line 548
    .line 549
    throw v0

    .line 550
    :pswitch_8
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, Lj2/v;

    .line 553
    .line 554
    const/4 v2, 0x0

    .line 555
    iput-boolean v2, v0, Lj2/v;->S0:Z

    .line 556
    .line 557
    iget-object v2, v0, Lj2/v;->K0:Landroid/view/MotionEvent;

    .line 558
    .line 559
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    const/16 v4, 0xa

    .line 567
    .line 568
    if-ne v3, v4, :cond_15

    .line 569
    .line 570
    invoke-virtual {v0, v2}, Lj2/v;->M(Landroid/view/MotionEvent;)I

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :cond_15
    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    .line 575
    .line 576
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 577
    .line 578
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    throw v2

    .line 582
    :pswitch_9
    invoke-direct {v1}, La9/m;->b()V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_a
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v0, Lj3/s;

    .line 589
    .line 590
    invoke-static {v0}, Lj3/s;->b(Lj3/s;)V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :pswitch_b
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v0, Ld/l;

    .line 597
    .line 598
    iget-object v2, v0, Ld/l;->b:Ljava/lang/Runnable;

    .line 599
    .line 600
    if-eqz v2, :cond_16

    .line 601
    .line 602
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 603
    .line 604
    .line 605
    iput-object v4, v0, Ld/l;->b:Ljava/lang/Runnable;

    .line 606
    .line 607
    :cond_16
    return-void

    .line 608
    :pswitch_c
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, Ld/n;

    .line 611
    .line 612
    invoke-static {v0}, Ld/n;->g(Ld/n;)V

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :pswitch_d
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v0, Lb0/c1;

    .line 619
    .line 620
    invoke-virtual {v0}, Lb0/c1;->r()V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_e
    invoke-direct {v1}, La9/m;->a()V

    .line 625
    .line 626
    .line 627
    return-void

    .line 628
    :pswitch_f
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v0, Lb7/d4;

    .line 631
    .line 632
    invoke-virtual {v0}, Lb7/d4;->a()V

    .line 633
    .line 634
    .line 635
    return-void

    .line 636
    :pswitch_10
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v0, Lcom/cnl/kikoeru/MainService;

    .line 639
    .line 640
    iget-object v2, v0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 641
    .line 642
    monitor-enter v2

    .line 643
    :try_start_7
    monitor-exit v2

    .line 644
    return-void

    .line 645
    :catchall_5
    move-exception v0

    .line 646
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 647
    throw v0

    .line 648
    :pswitch_11
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v0, Lb7/t0;

    .line 651
    .line 652
    iget-object v2, v0, Lb7/t0;->l:Lb7/s0;

    .line 653
    .line 654
    if-eqz v2, :cond_17

    .line 655
    .line 656
    iget-object v3, v0, Lb7/t0;->d:Landroid/content/Context;

    .line 657
    .line 658
    invoke-virtual {v3, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 659
    .line 660
    .line 661
    iput-object v4, v0, Lb7/t0;->l:Lb7/s0;

    .line 662
    .line 663
    :cond_17
    iget-object v0, v0, Lb7/t0;->c:Lb7/i1;

    .line 664
    .line 665
    iget-object v0, v0, Lb7/i1;->e:Ljava/lang/ref/WeakReference;

    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :pswitch_12
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Lb7/d0;

    .line 674
    .line 675
    invoke-virtual {v0}, Lb7/d0;->d()V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_13
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v0, Lb5/e;

    .line 682
    .line 683
    invoke-virtual {v0, v4}, Lb5/e;->c(Lb5/q;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_14
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Lb5/i;

    .line 690
    .line 691
    iget-boolean v2, v0, Lb5/i;->c:Z

    .line 692
    .line 693
    if-eqz v2, :cond_18

    .line 694
    .line 695
    goto :goto_e

    .line 696
    :cond_18
    iget-object v2, v0, Lb5/i;->b:Lb5/l;

    .line 697
    .line 698
    if-eqz v2, :cond_19

    .line 699
    .line 700
    iget-object v3, v0, Lb5/i;->a:Lb5/q;

    .line 701
    .line 702
    invoke-interface {v2, v3}, Lb5/l;->c(Lb5/q;)V

    .line 703
    .line 704
    .line 705
    :cond_19
    iget-object v2, v0, Lb5/i;->d:Lb5/j;

    .line 706
    .line 707
    iget-object v2, v2, Lb5/j;->m:Ljava/util/Set;

    .line 708
    .line 709
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    iput-boolean v5, v0, Lb5/i;->c:Z

    .line 713
    .line 714
    :goto_e
    return-void

    .line 715
    :pswitch_15
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v0, Landroidx/media3/exoplayer/offline/q;

    .line 718
    .line 719
    invoke-virtual {v0}, Landroidx/media3/exoplayer/offline/q;->a()V

    .line 720
    .line 721
    .line 722
    return-void

    .line 723
    :pswitch_16
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, Landroidx/lifecycle/e0;

    .line 726
    .line 727
    iget-object v2, v0, Landroidx/lifecycle/e0;->f:Landroidx/lifecycle/z;

    .line 728
    .line 729
    iget v3, v0, Landroidx/lifecycle/e0;->b:I

    .line 730
    .line 731
    if-nez v3, :cond_1a

    .line 732
    .line 733
    iput-boolean v5, v0, Landroidx/lifecycle/e0;->c:Z

    .line 734
    .line 735
    sget-object v3, Landroidx/lifecycle/o;->ON_PAUSE:Landroidx/lifecycle/o;

    .line 736
    .line 737
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->D1(Landroidx/lifecycle/o;)V

    .line 738
    .line 739
    .line 740
    :cond_1a
    iget v3, v0, Landroidx/lifecycle/e0;->a:I

    .line 741
    .line 742
    if-nez v3, :cond_1b

    .line 743
    .line 744
    iget-boolean v3, v0, Landroidx/lifecycle/e0;->c:Z

    .line 745
    .line 746
    if-eqz v3, :cond_1b

    .line 747
    .line 748
    sget-object v3, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 749
    .line 750
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->D1(Landroidx/lifecycle/o;)V

    .line 751
    .line 752
    .line 753
    iput-boolean v5, v0, Landroidx/lifecycle/e0;->d:Z

    .line 754
    .line 755
    :cond_1b
    return-void

    .line 756
    :pswitch_17
    iget-object v0, v1, La9/m;->b:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v0, Lb7/f0;

    .line 759
    .line 760
    sget v2, Lcom/cnl/kikoeru/MainService;->i:I

    .line 761
    .line 762
    invoke-virtual {v0}, Lcb/p;->get()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    return-void

    .line 766
    nop

    .line 767
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method
