.class public Lcom/tencent/bugly/proguard/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "NEW_TINKER_ID:"

    .line 4
    .line 5
    const-string v2, "TINKER_ID:"

    .line 6
    .line 7
    const-class v3, Lcom/tencent/bugly/proguard/t;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 11
    .line 12
    const-string v5, "dex"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-virtual {v0, v5, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-string v7, "tmpPatch"

    .line 24
    .line 25
    const v8, 0x8000

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v7, v8}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    new-instance v8, Ljava/io/File;

    .line 37
    .line 38
    const-string v9, "patch.apk"

    .line 39
    .line 40
    invoke-direct {v8, v5, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v8, v4, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 44
    .line 45
    const-string v5, "PatchFile"

    .line 46
    .line 47
    const-string v8, ""

    .line 48
    .line 49
    invoke-static {v5, v8}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    iget-object v5, v4, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v8, "PatchFile"

    .line 66
    .line 67
    invoke-static {v8, v5}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_0
    :goto_0
    new-instance v5, Ljava/io/File;

    .line 75
    .line 76
    const-string v8, "tmpPatch.apk"

    .line 77
    .line 78
    invoke-direct {v5, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v5, v4, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 82
    .line 83
    iget-object v5, v4, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 84
    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    const-string v5, "PatchFile"

    .line 88
    .line 89
    const-string v7, ""

    .line 90
    .line 91
    invoke-static {v5, v7}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_1

    .line 100
    .line 101
    iget-object v5, v4, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const-string v7, "PatchFile"

    .line 108
    .line 109
    invoke-static {v7, v5}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    const-string v5, "tmpPatch"

    .line 113
    .line 114
    invoke-virtual {v0, v5, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, v4, Lcom/tencent/bugly/beta/global/e;->K:Ljava/io/File;

    .line 119
    .line 120
    if-eqz v0, :cond_2

    .line 121
    .line 122
    const-string v0, "PatchTmpDir"

    .line 123
    .line 124
    const-string v5, ""

    .line 125
    .line 126
    invoke-static {v0, v5}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    iget-object v0, v4, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const-string v5, "PatchTmpDir"

    .line 143
    .line 144
    invoke-static {v5, v0}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 148
    .line 149
    const-string v5, "hotfix.strategy.bch"

    .line 150
    .line 151
    invoke-static {v5, v0}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 156
    .line 157
    const/4 v5, 0x3

    .line 158
    const/4 v7, 0x1

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    iget-object v8, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 162
    .line 163
    if-eqz v8, :cond_7

    .line 164
    .line 165
    iget v9, v8, Lcom/tencent/bugly/proguard/B;->u:I

    .line 166
    .line 167
    if-ne v9, v5, :cond_7

    .line 168
    .line 169
    iget-object v8, v8, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 170
    .line 171
    if-eqz v8, :cond_3

    .line 172
    .line 173
    const-string v9, "H2"

    .line 174
    .line 175
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    check-cast v8, Ljava/lang/String;

    .line 180
    .line 181
    iput-object v8, v4, Lcom/tencent/bugly/beta/global/e;->O:Ljava/lang/String;

    .line 182
    .line 183
    :cond_3
    const-string v8, "PatchResult"

    .line 184
    .line 185
    invoke-static {v8, v6}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    iput-boolean v8, v4, Lcom/tencent/bugly/beta/global/e;->P:Z

    .line 190
    .line 191
    const-string v8, "PATCH_MAX_TIMES"

    .line 192
    .line 193
    const-string v9, "0"

    .line 194
    .line 195
    invoke-static {v8, v9}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    iput v8, v4, Lcom/tencent/bugly/beta/global/e;->Q:I

    .line 208
    .line 209
    iget-boolean v8, v4, Lcom/tencent/bugly/beta/global/e;->P:Z

    .line 210
    .line 211
    if-nez v8, :cond_5

    .line 212
    .line 213
    new-array v8, v6, [Ljava/lang/Object;

    .line 214
    .line 215
    const-string v9, "[patch] inject failure"

    .line 216
    .line 217
    invoke-static {v9, v8}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    const-string v8, "UPLOAD_PATCH_RESULT"

    .line 221
    .line 222
    invoke-static {v8, v6}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-nez v8, :cond_9

    .line 227
    .line 228
    const-string v8, "UPLOAD_PATCH_RESULT"

    .line 229
    .line 230
    invoke-static {v8, v7}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    sget-object v8, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 234
    .line 235
    new-instance v9, Lcom/tencent/bugly/proguard/z;

    .line 236
    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 238
    .line 239
    .line 240
    move-result-wide v11

    .line 241
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 242
    .line 243
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 244
    .line 245
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 246
    .line 247
    move-object/from16 v17, v10

    .line 248
    .line 249
    const-string v10, "active"

    .line 250
    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    const/16 v19, 0x0

    .line 254
    .line 255
    const/4 v13, 0x1

    .line 256
    const-wide/16 v14, 0x0

    .line 257
    .line 258
    move/from16 v18, v0

    .line 259
    .line 260
    invoke-direct/range {v9 .. v19}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v8, v9}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_4

    .line 268
    .line 269
    new-array v0, v6, [Ljava/lang/Object;

    .line 270
    .line 271
    const-string v8, "save patch failed event success!"

    .line 272
    .line 273
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_4
    new-array v0, v6, [Ljava/lang/Object;

    .line 279
    .line 280
    const-string v8, "save patch failed event failed!"

    .line 281
    .line 282
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :cond_5
    new-array v8, v6, [Ljava/lang/Object;

    .line 288
    .line 289
    const-string v9, "[patch] inject success"

    .line 290
    .line 291
    invoke-static {v9, v8}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    const-string v8, "UPLOAD_PATCH_RESULT"

    .line 295
    .line 296
    invoke-static {v8, v6}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-nez v8, :cond_9

    .line 301
    .line 302
    const-string v8, "UPLOAD_PATCH_RESULT"

    .line 303
    .line 304
    invoke-static {v8, v7}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 305
    .line 306
    .line 307
    sget-object v8, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 308
    .line 309
    new-instance v9, Lcom/tencent/bugly/proguard/z;

    .line 310
    .line 311
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 312
    .line 313
    .line 314
    move-result-wide v11

    .line 315
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 316
    .line 317
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 318
    .line 319
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 320
    .line 321
    move-object/from16 v17, v10

    .line 322
    .line 323
    const-string v10, "active"

    .line 324
    .line 325
    const/16 v16, 0x0

    .line 326
    .line 327
    const/16 v19, 0x0

    .line 328
    .line 329
    const/4 v13, 0x0

    .line 330
    const-wide/16 v14, 0x0

    .line 331
    .line 332
    move/from16 v18, v0

    .line 333
    .line 334
    invoke-direct/range {v9 .. v19}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v9}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_6

    .line 342
    .line 343
    new-array v0, v6, [Ljava/lang/Object;

    .line 344
    .line 345
    const-string v8, "save patch success event success!"

    .line 346
    .line 347
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_6
    new-array v0, v6, [Ljava/lang/Object;

    .line 352
    .line 353
    const-string v8, "save patch success event failed!"

    .line 354
    .line 355
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_1

    .line 359
    :cond_7
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    iget-object v8, v4, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 364
    .line 365
    invoke-virtual {v0, v8}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getPatchDirectory(Landroid/content/Context;)Ljava/io/File;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_8

    .line 370
    .line 371
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iget-object v8, v4, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 376
    .line 377
    invoke-virtual {v0, v8}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getPatchDirectory(Landroid/content/Context;)Ljava/io/File;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_8

    .line 386
    .line 387
    const-string v0, "IS_PATCH_ROLL_BACK"

    .line 388
    .line 389
    invoke-static {v0, v6}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 390
    .line 391
    .line 392
    :cond_8
    const-string v0, "IS_PATCH_ROLL_BACK"

    .line 393
    .line 394
    invoke-static {v0, v6}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_9

    .line 399
    .line 400
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onPatchRollback(Z)V

    .line 405
    .line 406
    .line 407
    :cond_9
    :goto_1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getNewTinkerId()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_a

    .line 416
    .line 417
    new-array v0, v6, [Ljava/lang/Object;

    .line 418
    .line 419
    const-string v8, "[patch] tinker new id is null ,so patch version is invalid"

    .line 420
    .line 421
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    const-string v0, ""

    .line 425
    .line 426
    iput-object v0, v4, Lcom/tencent/bugly/beta/global/e;->O:Ljava/lang/String;

    .line 427
    .line 428
    :cond_a
    iget-object v0, v4, Lcom/tencent/bugly/beta/global/e;->O:Ljava/lang/String;

    .line 429
    .line 430
    const-string v8, "G15"

    .line 431
    .line 432
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 436
    .line 437
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 438
    .line 439
    if-eqz v0, :cond_b

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    if-eqz v8, :cond_b

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_b

    .line 452
    .line 453
    new-array v0, v6, [Ljava/lang/Object;

    .line 454
    .line 455
    const-string v8, "[patch] delete tmpPatch.apk success"

    .line 456
    .line 457
    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    :cond_b
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 461
    .line 462
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->I:Ljava/io/File;

    .line 463
    .line 464
    if-eqz v0, :cond_c

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 467
    .line 468
    .line 469
    move-result v8

    .line 470
    if-eqz v8, :cond_c

    .line 471
    .line 472
    const-string v8, "SHA"

    .line 473
    .line 474
    invoke-static {v0, v8}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-eqz v0, :cond_c

    .line 479
    .line 480
    sget-object v8, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 481
    .line 482
    iput-object v0, v8, Lcom/tencent/bugly/beta/global/e;->N:Ljava/lang/String;

    .line 483
    .line 484
    :cond_c
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->isTinkerManagerInstalled()Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_e

    .line 489
    .line 490
    iget-object v0, v4, Lcom/tencent/bugly/beta/global/e;->L:Ljava/lang/String;

    .line 491
    .line 492
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_d

    .line 497
    .line 498
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getTinkerId()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    iput-object v0, v4, Lcom/tencent/bugly/beta/global/e;->L:Ljava/lang/String;

    .line 503
    .line 504
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v2, v4, Lcom/tencent/bugly/beta/global/e;->L:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    new-array v2, v6, [Ljava/lang/Object;

    .line 519
    .line 520
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getNewTinkerId()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iput-object v0, v4, Lcom/tencent/bugly/beta/global/e;->M:Ljava/lang/String;

    .line 528
    .line 529
    new-instance v0, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    iget-object v1, v4, Lcom/tencent/bugly/beta/global/e;->M:Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    new-array v1, v6, [Ljava/lang/Object;

    .line 544
    .line 545
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    new-instance v1, Lcom/tencent/bugly/proguard/e0;

    .line 553
    .line 554
    invoke-direct {v1, v4}, Lcom/tencent/bugly/proguard/e0;-><init>(Lcom/tencent/bugly/beta/global/e;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->setTinkerListener(Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerListener;)V

    .line 558
    .line 559
    .line 560
    :cond_e
    const-string v0, "BaseArchName"

    .line 561
    .line 562
    const-string v1, ""

    .line 563
    .line 564
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-eqz v0, :cond_15

    .line 573
    .line 574
    iget-object v0, v4, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 575
    .line 576
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 581
    .line 582
    if-eqz v0, :cond_15

    .line 583
    .line 584
    new-instance v1, Ljava/io/File;

    .line 585
    .line 586
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    if-eqz v0, :cond_15

    .line 594
    .line 595
    array-length v1, v0

    .line 596
    if-lez v1, :cond_15

    .line 597
    .line 598
    array-length v1, v0

    .line 599
    const/4 v2, 0x0

    .line 600
    const/4 v8, 0x0

    .line 601
    :goto_2
    if-ge v2, v1, :cond_15

    .line 602
    .line 603
    aget-object v9, v0, v2

    .line 604
    .line 605
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v10

    .line 609
    const-string v11, ".so"

    .line 610
    .line 611
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 612
    .line 613
    .line 614
    move-result v10

    .line 615
    if-eqz v10, :cond_14

    .line 616
    .line 617
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v10

    .line 621
    const-string v11, ".so"

    .line 622
    .line 623
    const-string v12, ""

    .line 624
    .line 625
    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v10

    .line 629
    const-string v11, "lib"

    .line 630
    .line 631
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 632
    .line 633
    .line 634
    move-result v11

    .line 635
    if-eqz v11, :cond_f

    .line 636
    .line 637
    const-string v11, "lib"

    .line 638
    .line 639
    invoke-virtual {v10, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 640
    .line 641
    .line 642
    move-result v11

    .line 643
    add-int/2addr v11, v5

    .line 644
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    :cond_f
    new-instance v11, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const-string v12, "libName:"

    .line 654
    .line 655
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v11

    .line 665
    new-array v12, v6, [Ljava/lang/Object;

    .line 666
    .line 667
    invoke-static {v11, v12}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v9

    .line 674
    new-instance v11, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 677
    .line 678
    .line 679
    const-string v12, "soFilePath:"

    .line 680
    .line 681
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v11

    .line 691
    new-array v12, v6, [Ljava/lang/Object;

    .line 692
    .line 693
    invoke-static {v11, v12}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    iget-object v11, v4, Lcom/tencent/bugly/beta/global/e;->ca:Ljava/util/List;

    .line 697
    .line 698
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 699
    .line 700
    .line 701
    move-result-object v11

    .line 702
    :cond_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v12

    .line 706
    if-eqz v12, :cond_11

    .line 707
    .line 708
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v12

    .line 712
    check-cast v12, Ljava/lang/String;

    .line 713
    .line 714
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v12

    .line 718
    if-eqz v12, :cond_10

    .line 719
    .line 720
    const/4 v8, 0x1

    .line 721
    :cond_11
    if-nez v8, :cond_14

    .line 722
    .line 723
    invoke-static {v9}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v8

    .line 727
    new-instance v9, Ljava/lang/StringBuilder;

    .line 728
    .line 729
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 730
    .line 731
    .line 732
    const-string v11, "archName:"

    .line 733
    .line 734
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v9

    .line 744
    new-array v11, v6, [Ljava/lang/Object;

    .line 745
    .line 746
    invoke-static {v9, v11}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    if-eqz v8, :cond_12

    .line 750
    .line 751
    const-string v9, "armeabi-v5te"

    .line 752
    .line 753
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v9

    .line 757
    if-eqz v9, :cond_12

    .line 758
    .line 759
    const-string v8, "armeabi"

    .line 760
    .line 761
    :cond_12
    invoke-static {v10, v8}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    const-string v9, "BaseArchName"

    .line 765
    .line 766
    const-string v10, ""

    .line 767
    .line 768
    invoke-static {v9, v10}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 773
    .line 774
    .line 775
    move-result v9

    .line 776
    if-eqz v9, :cond_13

    .line 777
    .line 778
    const-string v9, "BaseArchName"

    .line 779
    .line 780
    invoke-static {v9, v8}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 781
    .line 782
    .line 783
    :cond_13
    const/4 v8, 0x0

    .line 784
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 785
    .line 786
    goto/16 :goto_2

    .line 787
    .line 788
    :cond_15
    monitor-exit v3

    .line 789
    return-void

    .line 790
    :goto_3
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 791
    throw v0
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
