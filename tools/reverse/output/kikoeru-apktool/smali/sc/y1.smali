.class public abstract Lsc/y1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsc/y1;->a:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public static final a(Ljava/lang/Class;)Ldd/f;
    .locals 48

    .line 1
    sget-object v16, Loe/j;->e:Loe/j;

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    invoke-static {v1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Led/d;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lsc/g2;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lsc/g2;-><init>(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lsc/y1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ldd/f;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    return-object v4

    .line 38
    :cond_0
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    new-instance v3, Ldd/b;

    .line 42
    .line 43
    invoke-direct {v3, v0}, Ldd/b;-><init>(Ljava/lang/ClassLoader;)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Ldd/b;

    .line 47
    .line 48
    const-class v5, Lub/a0;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-string v6, "getClassLoader(...)"

    .line 55
    .line 56
    invoke-static {v5, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v4, v5}, Ldd/b;-><init>(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Ldd/b;

    .line 63
    .line 64
    invoke-direct {v5, v0}, Ldd/b;-><init>(Ljava/lang/ClassLoader;)V

    .line 65
    .line 66
    .line 67
    new-instance v6, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v7, "runtime module for "

    .line 70
    .line 71
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v6, Ldd/e;->a:Ldd/e;

    .line 82
    .line 83
    sget-object v26, Ldd/e;->b:Ldd/e;

    .line 84
    .line 85
    const-string v7, "moduleName"

    .line 86
    .line 87
    invoke-static {v0, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance v7, Lre/l;

    .line 91
    .line 92
    const-string v8, "DeserializationComponentsForJava.ModuleData"

    .line 93
    .line 94
    invoke-direct {v7, v8}, Lre/l;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance v8, Lxc/i;

    .line 98
    .line 99
    invoke-direct {v8, v7}, Lxc/i;-><init>(Lre/l;)V

    .line 100
    .line 101
    .line 102
    new-instance v9, Lbd/h0;

    .line 103
    .line 104
    new-instance v10, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v11, "<"

    .line 107
    .line 108
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v0, 0x3e

    .line 115
    .line 116
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lbe/e;->g(Ljava/lang/String;)Lbe/e;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/16 v10, 0x38

    .line 128
    .line 129
    invoke-direct {v9, v0, v7, v8, v10}, Lbd/h0;-><init>(Lbe/e;Lre/l;Lvc/i;I)V

    .line 130
    .line 131
    .line 132
    iget-object v10, v7, Lre/l;->a:Lre/n;

    .line 133
    .line 134
    invoke-interface {v10}, Lre/n;->lock()V

    .line 135
    .line 136
    .line 137
    :try_start_0
    iget-object v0, v8, Lvc/i;->a:Lbd/h0;

    .line 138
    .line 139
    if-nez v0, :cond_9

    .line 140
    .line 141
    iput-object v9, v8, Lvc/i;->a:Lbd/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 142
    .line 143
    invoke-interface {v10}, Lre/n;->unlock()V

    .line 144
    .line 145
    .line 146
    new-instance v0, Lbd/g0;

    .line 147
    .line 148
    const/4 v10, 0x2

    .line 149
    invoke-direct {v0, v9, v10}, Lbd/g0;-><init>(Lbd/h0;I)V

    .line 150
    .line 151
    .line 152
    iput-object v0, v8, Lxc/i;->f:Lbd/g0;

    .line 153
    .line 154
    new-instance v21, Lud/g;

    .line 155
    .line 156
    invoke-direct/range {v21 .. v21}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    new-instance v27, Li7/p2;

    .line 160
    .line 161
    invoke-direct/range {v27 .. v27}, Ljava/lang/Object;-><init>()V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lb0/w1;

    .line 165
    .line 166
    invoke-direct {v0, v7, v9}, Lb0/w1;-><init>(Lre/l;Lyc/y;)V

    .line 167
    .line 168
    .line 169
    sget-object v28, Lud/h;->b:Lud/h;

    .line 170
    .line 171
    new-instance v11, Lub/g;

    .line 172
    .line 173
    const/4 v12, 0x1

    .line 174
    const/16 v13, 0x9

    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    invoke-direct {v11, v12, v13, v14}, Lub/g;-><init>(III)V

    .line 178
    .line 179
    .line 180
    new-instance v15, Lb7/n;

    .line 181
    .line 182
    sget-object v10, Lld/r;->d:Lld/s;

    .line 183
    .line 184
    iget-object v12, v10, Lld/s;->b:Lub/g;

    .line 185
    .line 186
    if-eqz v12, :cond_2

    .line 187
    .line 188
    iget v12, v12, Lub/g;->d:I

    .line 189
    .line 190
    iget v14, v11, Lub/g;->d:I

    .line 191
    .line 192
    sub-int/2addr v12, v14

    .line 193
    if-gtz v12, :cond_2

    .line 194
    .line 195
    iget-object v10, v10, Lld/s;->c:Lld/a0;

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_2
    iget-object v10, v10, Lld/s;->a:Lld/a0;

    .line 199
    .line 200
    :goto_0
    const-string v12, "globalReportLevel"

    .line 201
    .line 202
    invoke-static {v10, v12}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    sget-object v12, Lld/a0;->c:Lld/a0;

    .line 206
    .line 207
    if-ne v10, v12, :cond_3

    .line 208
    .line 209
    const/4 v12, 0x0

    .line 210
    goto :goto_1

    .line 211
    :cond_3
    move-object v12, v10

    .line 212
    :goto_1
    new-instance v14, Lld/u;

    .line 213
    .line 214
    invoke-direct {v14, v10, v12}, Lld/u;-><init>(Lld/a0;Lld/a0;)V

    .line 215
    .line 216
    .line 217
    new-instance v10, Lbd/a;

    .line 218
    .line 219
    invoke-direct {v10, v13, v11}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v15, v14, v10}, Lb7/n;-><init>(Lld/u;Lbd/a;)V

    .line 223
    .line 224
    .line 225
    new-instance v17, Lod/a;

    .line 226
    .line 227
    sget-object v22, Lmd/h;->c:Lmd/h;

    .line 228
    .line 229
    sget-object v24, Lmd/h;->a:Lmd/h;

    .line 230
    .line 231
    new-instance v10, Lg5/w;

    .line 232
    .line 233
    invoke-direct {v10, v7}, Lg5/w;-><init>(Lre/l;)V

    .line 234
    .line 235
    .line 236
    sget-object v29, Lyc/n0;->c:Lyc/n0;

    .line 237
    .line 238
    new-instance v11, Lvc/m;

    .line 239
    .line 240
    invoke-direct {v11, v9, v0}, Lvc/m;-><init>(Lbd/h0;Lb0/w1;)V

    .line 241
    .line 242
    .line 243
    new-instance v12, Lld/b;

    .line 244
    .line 245
    invoke-direct {v12, v15}, Lld/b;-><init>(Lb7/n;)V

    .line 246
    .line 247
    .line 248
    new-instance v34, Ltd/c;

    .line 249
    .line 250
    sget-object v36, Lod/b;->a:Lod/b;

    .line 251
    .line 252
    invoke-direct/range {v34 .. v34}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    sget-object v13, Lte/k;->b:Lte/j;

    .line 256
    .line 257
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    sget-object v37, Lte/j;->b:Lte/l;

    .line 261
    .line 262
    new-instance v39, Lud/h;

    .line 263
    .line 264
    invoke-direct/range {v39 .. v39}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    sget-object v30, Lgd/a;->a:Lgd/a;

    .line 268
    .line 269
    sget-object v35, Lld/l;->a:Lld/l;

    .line 270
    .line 271
    move-object/from16 v20, v3

    .line 272
    .line 273
    move-object/from16 v19, v5

    .line 274
    .line 275
    move-object/from16 v23, v6

    .line 276
    .line 277
    move-object/from16 v18, v7

    .line 278
    .line 279
    move-object/from16 v31, v9

    .line 280
    .line 281
    move-object/from16 v25, v10

    .line 282
    .line 283
    move-object/from16 v32, v11

    .line 284
    .line 285
    move-object/from16 v33, v12

    .line 286
    .line 287
    move-object/from16 v38, v15

    .line 288
    .line 289
    invoke-direct/range {v17 .. v39}, Lod/a;-><init>(Lre/o;Ldd/b;Ldd/b;Lud/g;Lmd/h;Loe/m;Lmd/h;Lg5/w;Ldd/e;Li7/p2;Lud/h;Lyc/n0;Lgd/a;Lyc/y;Lvc/m;Lld/b;Ltd/c;Lld/l;Lod/b;Lte/k;Lb7/n;Lud/h;)V

    .line 290
    .line 291
    .line 292
    move-object v5, v1

    .line 293
    move-object v10, v2

    .line 294
    move-object/from16 v9, v17

    .line 295
    .line 296
    move-object/from16 v1, v18

    .line 297
    .line 298
    move-object/from16 v7, v21

    .line 299
    .line 300
    move-object/from16 v2, v31

    .line 301
    .line 302
    new-instance v11, Lod/d;

    .line 303
    .line 304
    invoke-direct {v11, v9}, Lod/d;-><init>(Lod/a;)V

    .line 305
    .line 306
    .line 307
    sget-object v9, Lyd/e;->g:Lyd/e;

    .line 308
    .line 309
    const-string v12, "metadataVersion"

    .line 310
    .line 311
    invoke-static {v9, v12}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    new-instance v12, Lm0/w;

    .line 315
    .line 316
    const/16 v13, 0x1c

    .line 317
    .line 318
    invoke-direct {v12, v13, v3, v7}, Lm0/w;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    move-object v13, v4

    .line 322
    new-instance v4, Lb7/b1;

    .line 323
    .line 324
    invoke-direct {v4, v2, v0, v1, v3}, Lb7/b1;-><init>(Lbd/h0;Lb0/w1;Lre/l;Ldd/b;)V

    .line 325
    .line 326
    .line 327
    iput-object v9, v4, Lb7/b1;->g:Ljava/lang/Object;

    .line 328
    .line 329
    sget-object v9, Lse/k;->a:Lse/k;

    .line 330
    .line 331
    invoke-static {v9}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v15

    .line 335
    iget-object v9, v2, Lbd/h0;->d:Lvc/i;

    .line 336
    .line 337
    instance-of v14, v9, Lxc/i;

    .line 338
    .line 339
    if-eqz v14, :cond_4

    .line 340
    .line 341
    move-object v14, v9

    .line 342
    check-cast v14, Lxc/i;

    .line 343
    .line 344
    :goto_2
    move-object/from16 v34, v0

    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_4
    const/4 v14, 0x0

    .line 348
    goto :goto_2

    .line 349
    :goto_3
    new-instance v0, Loe/i;

    .line 350
    .line 351
    move-object/from16 v21, v7

    .line 352
    .line 353
    sget-object v7, Lud/h;->a:Lud/h;

    .line 354
    .line 355
    if-eqz v14, :cond_5

    .line 356
    .line 357
    invoke-virtual {v14}, Lxc/i;->J()Lxc/l;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    if-eqz v9, :cond_5

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_5
    sget-object v9, Lad/a;->b:Lad/a;

    .line 365
    .line 366
    :goto_4
    if-eqz v14, :cond_6

    .line 367
    .line 368
    invoke-virtual {v14}, Lxc/i;->J()Lxc/l;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    if-eqz v14, :cond_6

    .line 373
    .line 374
    :goto_5
    move-object/from16 v20, v3

    .line 375
    .line 376
    move-object v3, v12

    .line 377
    goto :goto_6

    .line 378
    :cond_6
    sget-object v14, Lad/a;->d:Lad/a;

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :goto_6
    sget-object v12, Lae/g;->a:Lce/i;

    .line 382
    .line 383
    move-object/from16 v17, v5

    .line 384
    .line 385
    move-object v5, v11

    .line 386
    move-object v11, v14

    .line 387
    new-instance v14, Lg5/w;

    .line 388
    .line 389
    invoke-direct {v14, v1}, Lg5/w;-><init>(Lre/l;)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v18, v8

    .line 393
    .line 394
    sget-object v8, Lvb/r;->a:Lvb/r;

    .line 395
    .line 396
    move-object/from16 v47, v10

    .line 397
    .line 398
    move-object/from16 v44, v13

    .line 399
    .line 400
    move-object/from16 v42, v17

    .line 401
    .line 402
    move-object/from16 v43, v20

    .line 403
    .line 404
    move-object/from16 v45, v21

    .line 405
    .line 406
    move-object/from16 v46, v27

    .line 407
    .line 408
    move-object/from16 v13, v37

    .line 409
    .line 410
    const/16 v41, 0x0

    .line 411
    .line 412
    move-object v10, v9

    .line 413
    move-object/from16 v9, v34

    .line 414
    .line 415
    invoke-direct/range {v0 .. v16}, Loe/i;-><init>(Lre/l;Lyc/y;Loe/e;Loe/a;Lyc/g0;Loe/m;Loe/n;Ljava/lang/Iterable;Lb0/w1;Lad/b;Lad/d;Lce/i;Lte/k;Lg5/w;Ljava/util/List;Loe/l;)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v7, v45

    .line 419
    .line 420
    iput-object v0, v7, Lud/g;->a:Loe/i;

    .line 421
    .line 422
    new-instance v3, Li7/p2;

    .line 423
    .line 424
    invoke-direct {v3, v5}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    move-object/from16 v4, v46

    .line 428
    .line 429
    iput-object v3, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 430
    .line 431
    new-instance v3, Lxc/n;

    .line 432
    .line 433
    invoke-virtual/range {v18 .. v18}, Lxc/i;->J()Lxc/l;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-virtual/range {v18 .. v18}, Lxc/i;->J()Lxc/l;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    new-instance v8, Lg5/w;

    .line 442
    .line 443
    invoke-direct {v8, v1}, Lg5/w;-><init>(Lre/l;)V

    .line 444
    .line 445
    .line 446
    const-string v10, "additionalClassPartsProvider"

    .line 447
    .line 448
    invoke-static {v4, v10}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    const-string v10, "platformDependentDeclarationFilter"

    .line 452
    .line 453
    invoke-static {v6, v10}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    move-object/from16 v13, v44

    .line 457
    .line 458
    invoke-direct {v3, v1, v13, v2}, Lxc/n;-><init>(Lre/l;Ldd/b;Lbd/h0;)V

    .line 459
    .line 460
    .line 461
    new-instance v27, Loe/i;

    .line 462
    .line 463
    new-instance v10, Li7/p2;

    .line 464
    .line 465
    invoke-direct {v10, v3}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    new-instance v11, Lm0/w;

    .line 469
    .line 470
    sget-object v12, Lpe/a;->m:Lpe/a;

    .line 471
    .line 472
    invoke-direct {v11, v2, v9, v12}, Lm0/w;-><init>(Lyc/y;Lb0/w1;Lne/a;)V

    .line 473
    .line 474
    .line 475
    new-instance v13, Lwc/a;

    .line 476
    .line 477
    invoke-direct {v13, v1, v2}, Lwc/a;-><init>(Lre/l;Lbd/h0;)V

    .line 478
    .line 479
    .line 480
    new-instance v14, Lxc/g;

    .line 481
    .line 482
    invoke-direct {v14, v1, v2}, Lxc/g;-><init>(Lre/l;Lbd/h0;)V

    .line 483
    .line 484
    .line 485
    move-object/from16 v28, v1

    .line 486
    .line 487
    const/4 v15, 0x2

    .line 488
    new-array v1, v15, [Lad/c;

    .line 489
    .line 490
    aput-object v13, v1, v41

    .line 491
    .line 492
    const/4 v13, 0x1

    .line 493
    aput-object v14, v1, v13

    .line 494
    .line 495
    invoke-static {v1}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    move-object/from16 v33, v1

    .line 500
    .line 501
    check-cast v33, Ljava/lang/Iterable;

    .line 502
    .line 503
    iget-object v1, v12, Lne/a;->a:Lce/i;

    .line 504
    .line 505
    const/high16 v40, 0x40000

    .line 506
    .line 507
    move-object/from16 v29, v2

    .line 508
    .line 509
    move-object/from16 v32, v3

    .line 510
    .line 511
    move-object/from16 v35, v4

    .line 512
    .line 513
    move-object/from16 v36, v6

    .line 514
    .line 515
    move-object/from16 v39, v8

    .line 516
    .line 517
    move-object/from16 v30, v10

    .line 518
    .line 519
    move-object/from16 v31, v11

    .line 520
    .line 521
    move-object/from16 v38, v37

    .line 522
    .line 523
    move-object/from16 v37, v1

    .line 524
    .line 525
    invoke-direct/range {v27 .. v40}, Loe/i;-><init>(Lre/l;Lyc/y;Li7/p2;Lm0/w;Lyc/g0;Ljava/lang/Iterable;Lb0/w1;Lad/b;Lad/d;Lce/i;Lte/k;Lg5/w;I)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v3, v27

    .line 529
    .line 530
    move-object/from16 v1, v32

    .line 531
    .line 532
    iput-object v3, v1, Lxc/n;->c:Loe/i;

    .line 533
    .line 534
    new-array v3, v13, [Lbd/h0;

    .line 535
    .line 536
    aput-object v2, v3, v41

    .line 537
    .line 538
    invoke-static {v3}, Lvb/l;->M0([Ljava/lang/Object;)Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    new-instance v4, Lbd/f0;

    .line 543
    .line 544
    invoke-direct {v4, v3}, Lbd/f0;-><init>(Ljava/util/List;)V

    .line 545
    .line 546
    .line 547
    iput-object v4, v2, Lbd/h0;->g:Lbd/f0;

    .line 548
    .line 549
    new-instance v3, Lbd/o;

    .line 550
    .line 551
    new-array v4, v15, [Lyc/g0;

    .line 552
    .line 553
    aput-object v5, v4, v41

    .line 554
    .line 555
    aput-object v1, v4, v13

    .line 556
    .line 557
    invoke-static {v4}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    new-instance v4, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    const-string v5, "CompositeProvider@RuntimeModuleData for "

    .line 564
    .line 565
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-direct {v3, v1, v4}, Lbd/o;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    iput-object v3, v2, Lbd/h0;->h:Lyc/g0;

    .line 579
    .line 580
    new-instance v1, Ldd/f;

    .line 581
    .line 582
    new-instance v2, Lc7/e1;

    .line 583
    .line 584
    move-object/from16 v3, v43

    .line 585
    .line 586
    invoke-direct {v2, v7, v3}, Lc7/e1;-><init>(Lud/g;Ldd/b;)V

    .line 587
    .line 588
    .line 589
    invoke-direct {v1, v0, v2}, Ldd/f;-><init>(Loe/i;Lc7/e1;)V

    .line 590
    .line 591
    .line 592
    :goto_7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 593
    .line 594
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    move-object/from16 v5, v42

    .line 598
    .line 599
    move-object/from16 v2, v47

    .line 600
    .line 601
    invoke-virtual {v2, v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 606
    .line 607
    if-nez v0, :cond_7

    .line 608
    .line 609
    return-object v1

    .line 610
    :cond_7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    check-cast v3, Ldd/f;

    .line 615
    .line 616
    if-eqz v3, :cond_8

    .line 617
    .line 618
    return-object v3

    .line 619
    :cond_8
    invoke-virtual {v2, v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-object/from16 v47, v2

    .line 623
    .line 624
    move-object/from16 v42, v5

    .line 625
    .line 626
    goto :goto_7

    .line 627
    :cond_9
    move-object v3, v7

    .line 628
    move-object/from16 v18, v8

    .line 629
    .line 630
    move-object v2, v9

    .line 631
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 632
    .line 633
    new-instance v1, Ljava/lang/StringBuilder;

    .line 634
    .line 635
    const-string v4, "Built-ins module is already set: "

    .line 636
    .line 637
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    move-object/from16 v4, v18

    .line 641
    .line 642
    iget-object v4, v4, Lvc/i;->a:Lbd/h0;

    .line 643
    .line 644
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    const-string v4, " (attempting to reset to "

    .line 648
    .line 649
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    const-string v2, ")"

    .line 656
    .line 657
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 668
    :catchall_0
    move-exception v0

    .line 669
    goto :goto_8

    .line 670
    :catchall_1
    move-exception v0

    .line 671
    move-object v3, v7

    .line 672
    :goto_8
    :try_start_2
    iget-object v1, v3, Lre/l;->b:Lre/a;

    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 678
    :catchall_2
    move-exception v0

    .line 679
    invoke-interface {v10}, Lre/n;->unlock()V

    .line 680
    .line 681
    .line 682
    throw v0
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
