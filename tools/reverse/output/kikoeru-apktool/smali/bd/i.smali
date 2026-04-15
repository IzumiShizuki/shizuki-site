.class public final Lbd/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbd/i;->a:I

    iput-object p2, p0, Lbd/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Lbd/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput p1, p0, Lbd/i;->a:I

    iput-object p2, p0, Lbd/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Lbd/i;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lbd/i;->a:I

    .line 4
    .line 5
    const-string v2, "additionalAnnotations"

    .line 6
    .line 7
    const-string v3, "<this>"

    .line 8
    .line 9
    sget-object v4, Lvb/r;->a:Lvb/r;

    .line 10
    .line 11
    const/16 v5, 0xa

    .line 12
    .line 13
    const-string v6, "getContainingDeclaration(...)"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    sget-object v8, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    iget-object v11, v1, Lbd/i;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v12, v1, Lbd/i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v11, Lpd/i;

    .line 28
    .line 29
    check-cast v12, Lyc/e;

    .line 30
    .line 31
    new-instance v0, Lpd/i;

    .line 32
    .line 33
    iget-object v2, v11, Lpd/i;->j:Lb0/w1;

    .line 34
    .line 35
    iget-object v3, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lod/a;

    .line 38
    .line 39
    new-instance v13, Lod/a;

    .line 40
    .line 41
    iget-object v14, v3, Lod/a;->a:Lre/o;

    .line 42
    .line 43
    iget-object v15, v3, Lod/a;->b:Ldd/b;

    .line 44
    .line 45
    iget-object v4, v3, Lod/a;->c:Ldd/b;

    .line 46
    .line 47
    iget-object v5, v3, Lod/a;->d:Lud/g;

    .line 48
    .line 49
    iget-object v7, v3, Lod/a;->e:Lmd/h;

    .line 50
    .line 51
    iget-object v8, v3, Lod/a;->f:Loe/m;

    .line 52
    .line 53
    iget-object v9, v3, Lod/a;->h:Lmd/h;

    .line 54
    .line 55
    iget-object v10, v3, Lod/a;->i:Lg5/w;

    .line 56
    .line 57
    move-object/from16 v16, v4

    .line 58
    .line 59
    iget-object v4, v3, Lod/a;->j:Ldd/e;

    .line 60
    .line 61
    move-object/from16 v22, v4

    .line 62
    .line 63
    iget-object v4, v3, Lod/a;->k:Li7/p2;

    .line 64
    .line 65
    move-object/from16 v23, v4

    .line 66
    .line 67
    iget-object v4, v3, Lod/a;->l:Lud/h;

    .line 68
    .line 69
    move-object/from16 v24, v4

    .line 70
    .line 71
    iget-object v4, v3, Lod/a;->m:Lyc/n0;

    .line 72
    .line 73
    move-object/from16 v25, v4

    .line 74
    .line 75
    iget-object v4, v3, Lod/a;->n:Lgd/a;

    .line 76
    .line 77
    move-object/from16 v26, v4

    .line 78
    .line 79
    iget-object v4, v3, Lod/a;->o:Lyc/y;

    .line 80
    .line 81
    move-object/from16 v27, v4

    .line 82
    .line 83
    iget-object v4, v3, Lod/a;->p:Lvc/m;

    .line 84
    .line 85
    move-object/from16 v28, v4

    .line 86
    .line 87
    iget-object v4, v3, Lod/a;->q:Lld/b;

    .line 88
    .line 89
    move-object/from16 v29, v4

    .line 90
    .line 91
    iget-object v4, v3, Lod/a;->r:Ltd/c;

    .line 92
    .line 93
    move-object/from16 v30, v4

    .line 94
    .line 95
    iget-object v4, v3, Lod/a;->s:Lld/l;

    .line 96
    .line 97
    move-object/from16 v31, v4

    .line 98
    .line 99
    iget-object v4, v3, Lod/a;->t:Lod/b;

    .line 100
    .line 101
    move-object/from16 v32, v4

    .line 102
    .line 103
    iget-object v4, v3, Lod/a;->u:Lte/k;

    .line 104
    .line 105
    move-object/from16 v33, v4

    .line 106
    .line 107
    iget-object v4, v3, Lod/a;->v:Lb7/n;

    .line 108
    .line 109
    iget-object v3, v3, Lod/a;->w:Lud/h;

    .line 110
    .line 111
    move-object/from16 v35, v3

    .line 112
    .line 113
    move-object/from16 v34, v4

    .line 114
    .line 115
    move-object/from16 v17, v5

    .line 116
    .line 117
    move-object/from16 v18, v7

    .line 118
    .line 119
    move-object/from16 v19, v8

    .line 120
    .line 121
    move-object/from16 v20, v9

    .line 122
    .line 123
    move-object/from16 v21, v10

    .line 124
    .line 125
    invoke-direct/range {v13 .. v35}, Lod/a;-><init>(Lre/o;Ldd/b;Ldd/b;Lud/g;Lmd/h;Loe/m;Lmd/h;Lg5/w;Ldd/e;Li7/p2;Lud/h;Lyc/n0;Lgd/a;Lyc/y;Lvc/m;Lld/b;Ltd/c;Lld/l;Lod/b;Lte/k;Lb7/n;Lud/h;)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Lb0/w1;

    .line 129
    .line 130
    iget-object v4, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Lod/e;

    .line 133
    .line 134
    iget-object v2, v2, Lb0/w1;->b:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-direct {v3, v13, v4, v2}, Lb0/w1;-><init>(Lod/a;Lod/e;Lub/h;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11}, Lbd/m;->y()Lyc/k;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {v2, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v4, v11, Lpd/i;->h:Led/o;

    .line 147
    .line 148
    invoke-direct {v0, v3, v2, v4, v12}, Lpd/i;-><init>(Lb0/w1;Lyc/k;Led/o;Lyc/e;)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_0
    check-cast v11, Lxc/l;

    .line 153
    .line 154
    check-cast v12, Lre/l;

    .line 155
    .line 156
    invoke-virtual {v11}, Lxc/l;->g()Lxc/h;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v0, v0, Lxc/h;->a:Lbd/h0;

    .line 161
    .line 162
    sget-object v2, Lxc/g;->d:Lxc/e;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v2, Lxc/g;->h:Lbe/b;

    .line 168
    .line 169
    new-instance v3, Lb0/w1;

    .line 170
    .line 171
    invoke-virtual {v11}, Lxc/l;->g()Lxc/h;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iget-object v4, v4, Lxc/h;->a:Lbd/h0;

    .line 176
    .line 177
    invoke-direct {v3, v12, v4}, Lb0/w1;-><init>(Lre/l;Lyc/y;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0, v2, v3}, Lyc/v;->f(Lyc/y;Lbe/b;Lb0/w1;)Lyc/e;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v0}, Lyc/e;->E()Lse/a0;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :pswitch_1
    check-cast v11, Lxc/i;

    .line 190
    .line 191
    check-cast v12, Lre/l;

    .line 192
    .line 193
    new-instance v0, Lxc/l;

    .line 194
    .line 195
    invoke-virtual {v11}, Lvc/i;->l()Lbd/h0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const-string v3, "getBuiltInsModule(...)"

    .line 200
    .line 201
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance v3, Lx0/h1;

    .line 205
    .line 206
    invoke-direct {v3, v10, v11}, Lx0/h1;-><init>(ILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-direct {v0, v2, v12, v3}, Lxc/l;-><init>(Lbd/h0;Lre/l;Lx0/h1;)V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_2
    check-cast v11, Lxc/g;

    .line 214
    .line 215
    move-object v8, v12

    .line 216
    check-cast v8, Lre/l;

    .line 217
    .line 218
    new-instance v2, Lbd/n;

    .line 219
    .line 220
    iget-object v0, v11, Lxc/g;->b:Lic/k;

    .line 221
    .line 222
    iget-object v3, v11, Lxc/g;->a:Lbd/h0;

    .line 223
    .line 224
    invoke-interface {v0, v3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lyc/k;

    .line 229
    .line 230
    sget-object v4, Lxc/g;->g:Lbe/e;

    .line 231
    .line 232
    iget-object v3, v3, Lbd/h0;->d:Lvc/i;

    .line 233
    .line 234
    invoke-virtual {v3}, Lvc/i;->e()Lse/a0;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v3}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    move-object v7, v3

    .line 243
    check-cast v7, Ljava/util/Collection;

    .line 244
    .line 245
    sget-object v5, Lyc/x;->e:Lyc/x;

    .line 246
    .line 247
    sget-object v6, Lyc/f;->b:Lyc/f;

    .line 248
    .line 249
    move-object v3, v0

    .line 250
    invoke-direct/range {v2 .. v8}, Lbd/n;-><init>(Lyc/k;Lbe/e;Lyc/x;Lyc/f;Ljava/util/Collection;Lre/o;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, Lxc/a;

    .line 254
    .line 255
    invoke-direct {v0, v8, v2}, Lle/h;-><init>(Lre/l;Lbd/c;)V

    .line 256
    .line 257
    .line 258
    sget-object v3, Lvb/t;->a:Lvb/t;

    .line 259
    .line 260
    invoke-virtual {v2, v0, v3, v9}, Lbd/n;->q(Lle/o;Ljava/util/Set;Lbd/l;)V

    .line 261
    .line 262
    .line 263
    return-object v2

    .line 264
    :pswitch_3
    check-cast v11, Lte/i;

    .line 265
    .line 266
    check-cast v12, Lte/f;

    .line 267
    .line 268
    iget-object v0, v11, Lte/i;->e:Ljava/lang/Object;

    .line 269
    .line 270
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    check-cast v0, Ljava/util/List;

    .line 275
    .line 276
    if-nez v0, :cond_0

    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_0
    move-object v4, v0

    .line 280
    :goto_0
    check-cast v4, Ljava/lang/Iterable;

    .line 281
    .line 282
    new-instance v0, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-static {v4, v5}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-eqz v3, :cond_1

    .line 300
    .line 301
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    check-cast v3, Lse/w0;

    .line 306
    .line 307
    invoke-virtual {v3, v12}, Lse/w0;->B(Lte/f;)Lse/w0;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_1
    return-object v0

    .line 316
    :pswitch_4
    check-cast v11, Ljava/lang/Class;

    .line 317
    .line 318
    check-cast v12, Ljava/util/Map;

    .line 319
    .line 320
    new-instance v3, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const/16 v0, 0x40

    .line 326
    .line 327
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    move-object v2, v0

    .line 342
    check-cast v2, Ljava/lang/Iterable;

    .line 343
    .line 344
    sget-object v7, Ltc/e;->a:Ltc/e;

    .line 345
    .line 346
    const/16 v8, 0x30

    .line 347
    .line 348
    const-string v4, ", "

    .line 349
    .line 350
    const-string v5, "("

    .line 351
    .line 352
    const-string v6, ")"

    .line 353
    .line 354
    invoke-static/range {v2 .. v8}, Lvb/m;->e0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :pswitch_5
    check-cast v11, Lte/f;

    .line 363
    .line 364
    check-cast v12, Lse/y;

    .line 365
    .line 366
    iget-object v0, v12, Lse/y;->c:Lic/a;

    .line 367
    .line 368
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Lve/d;

    .line 373
    .line 374
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    const-string v2, "type"

    .line 378
    .line 379
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    check-cast v0, Lse/w;

    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_6
    check-cast v11, Lsc/x1;

    .line 386
    .line 387
    check-cast v12, Lsc/w1;

    .line 388
    .line 389
    if-nez v11, :cond_b

    .line 390
    .line 391
    iget-object v0, v12, Lsc/w1;->a:Lyc/q0;

    .line 392
    .line 393
    invoke-interface {v0}, Lyc/k;->y()Lyc/k;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    instance-of v2, v0, Lyc/e;

    .line 401
    .line 402
    if-eqz v2, :cond_2

    .line 403
    .line 404
    check-cast v0, Lyc/e;

    .line 405
    .line 406
    invoke-static {v0}, Lsc/w1;->d(Lyc/e;)Lsc/d0;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    goto :goto_6

    .line 411
    :cond_2
    instance-of v2, v0, Lyc/c;

    .line 412
    .line 413
    if-eqz v2, :cond_a

    .line 414
    .line 415
    move-object v2, v0

    .line 416
    check-cast v2, Lyc/c;

    .line 417
    .line 418
    invoke-interface {v2}, Lyc/k;->y()Lyc/k;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {v2, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    instance-of v3, v2, Lyc/e;

    .line 426
    .line 427
    if-eqz v3, :cond_3

    .line 428
    .line 429
    check-cast v2, Lyc/e;

    .line 430
    .line 431
    invoke-static {v2}, Lsc/w1;->d(Lyc/e;)Lsc/d0;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    goto :goto_5

    .line 436
    :cond_3
    instance-of v2, v0, Lqe/k;

    .line 437
    .line 438
    if-eqz v2, :cond_4

    .line 439
    .line 440
    move-object v2, v0

    .line 441
    check-cast v2, Lqe/k;

    .line 442
    .line 443
    goto :goto_2

    .line 444
    :cond_4
    move-object v2, v9

    .line 445
    :goto_2
    if-eqz v2, :cond_9

    .line 446
    .line 447
    invoke-interface {v2}, Lqe/k;->q0()Lqe/j;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    instance-of v4, v3, Lud/i;

    .line 452
    .line 453
    if-eqz v4, :cond_5

    .line 454
    .line 455
    check-cast v3, Lud/i;

    .line 456
    .line 457
    goto :goto_3

    .line 458
    :cond_5
    move-object v3, v9

    .line 459
    :goto_3
    if-eqz v3, :cond_6

    .line 460
    .line 461
    iget-object v3, v3, Lud/i;->c:Ldd/c;

    .line 462
    .line 463
    goto :goto_4

    .line 464
    :cond_6
    move-object v3, v9

    .line 465
    :goto_4
    instance-of v4, v3, Ldd/c;

    .line 466
    .line 467
    if-eqz v4, :cond_7

    .line 468
    .line 469
    move-object v9, v3

    .line 470
    :cond_7
    if-eqz v9, :cond_8

    .line 471
    .line 472
    iget-object v3, v9, Ldd/c;->a:Ljava/lang/Class;

    .line 473
    .line 474
    if-eqz v3, :cond_8

    .line 475
    .line 476
    invoke-static {v3}, Lg8/a;->H(Ljava/lang/Class;)Lpc/c;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    check-cast v2, Lsc/d0;

    .line 481
    .line 482
    :goto_5
    new-instance v3, Lr/y1;

    .line 483
    .line 484
    const/4 v4, 0x7

    .line 485
    invoke-direct {v3, v4, v2}, Lr/y1;-><init>(ILjava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v0, v3, v8}, Lyc/k;->a0(Lyc/m;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    :goto_6
    move-object v11, v0

    .line 493
    check-cast v11, Lsc/x1;

    .line 494
    .line 495
    goto :goto_7

    .line 496
    :cond_8
    new-instance v0, Lhc/a;

    .line 497
    .line 498
    new-instance v3, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    const-string v4, "Container of deserialized member is not resolved: "

    .line 501
    .line 502
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-direct {v0, v2}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw v0

    .line 516
    :cond_9
    new-instance v2, Lhc/a;

    .line 517
    .line 518
    new-instance v3, Ljava/lang/StringBuilder;

    .line 519
    .line 520
    const-string v4, "Non-class callable descriptor must be deserialized: "

    .line 521
    .line 522
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-direct {v2, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    throw v2

    .line 536
    :cond_a
    new-instance v2, Lhc/a;

    .line 537
    .line 538
    new-instance v3, Ljava/lang/StringBuilder;

    .line 539
    .line 540
    const-string v4, "Unknown type parameter container: "

    .line 541
    .line 542
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-direct {v2, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    throw v2

    .line 556
    :cond_b
    :goto_7
    return-object v11

    .line 557
    :pswitch_7
    check-cast v11, Lsc/v1;

    .line 558
    .line 559
    check-cast v12, Lic/a;

    .line 560
    .line 561
    iget-object v0, v11, Lsc/v1;->a:Lse/w;

    .line 562
    .line 563
    invoke-virtual {v0}, Lse/w;->q()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-eqz v2, :cond_c

    .line 572
    .line 573
    goto/16 :goto_b

    .line 574
    .line 575
    :cond_c
    new-instance v2, Lsc/u1;

    .line 576
    .line 577
    invoke-direct {v2, v11, v10}, Lsc/u1;-><init>(Lsc/v1;I)V

    .line 578
    .line 579
    .line 580
    sget-object v3, Lub/i;->a:Lub/i;

    .line 581
    .line 582
    invoke-static {v3, v2}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    check-cast v0, Ljava/lang/Iterable;

    .line 587
    .line 588
    new-instance v4, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-static {v0, v5}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-eqz v3, :cond_13

    .line 606
    .line 607
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    add-int/lit8 v5, v7, 0x1

    .line 612
    .line 613
    if-ltz v7, :cond_12

    .line 614
    .line 615
    check-cast v3, Lse/n0;

    .line 616
    .line 617
    invoke-virtual {v3}, Lse/n0;->c()Z

    .line 618
    .line 619
    .line 620
    move-result v6

    .line 621
    if-eqz v6, :cond_d

    .line 622
    .line 623
    sget-object v3, Lpc/y;->c:Lpc/y;

    .line 624
    .line 625
    goto :goto_a

    .line 626
    :cond_d
    new-instance v6, Lsc/v1;

    .line 627
    .line 628
    invoke-virtual {v3}, Lse/n0;->b()Lse/w;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    const-string v13, "getType(...)"

    .line 633
    .line 634
    invoke-static {v8, v13}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    if-nez v12, :cond_e

    .line 638
    .line 639
    move-object v13, v9

    .line 640
    goto :goto_9

    .line 641
    :cond_e
    new-instance v13, Lfa/q;

    .line 642
    .line 643
    invoke-direct {v13, v11, v7, v2}, Lfa/q;-><init>(Lsc/v1;ILub/h;)V

    .line 644
    .line 645
    .line 646
    :goto_9
    invoke-direct {v6, v8, v13}, Lsc/v1;-><init>(Lse/w;Lic/a;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3}, Lse/n0;->a()Lse/x0;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    if-eqz v3, :cond_11

    .line 658
    .line 659
    if-eq v3, v10, :cond_10

    .line 660
    .line 661
    const/4 v7, 0x2

    .line 662
    if-ne v3, v7, :cond_f

    .line 663
    .line 664
    new-instance v3, Lpc/y;

    .line 665
    .line 666
    sget-object v7, Lpc/z;->c:Lpc/z;

    .line 667
    .line 668
    invoke-direct {v3, v7, v6}, Lpc/y;-><init>(Lpc/z;Lpc/v;)V

    .line 669
    .line 670
    .line 671
    goto :goto_a

    .line 672
    :cond_f
    new-instance v0, Lce/j0;

    .line 673
    .line 674
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 675
    .line 676
    .line 677
    throw v0

    .line 678
    :cond_10
    new-instance v3, Lpc/y;

    .line 679
    .line 680
    sget-object v7, Lpc/z;->b:Lpc/z;

    .line 681
    .line 682
    invoke-direct {v3, v7, v6}, Lpc/y;-><init>(Lpc/z;Lpc/v;)V

    .line 683
    .line 684
    .line 685
    goto :goto_a

    .line 686
    :cond_11
    sget-object v3, Lpc/y;->c:Lpc/y;

    .line 687
    .line 688
    invoke-static {v6}, Lnh/a;->x(Lpc/v;)Lpc/y;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    :goto_a
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move v7, v5

    .line 696
    goto :goto_8

    .line 697
    :cond_12
    invoke-static {}, Lud/b;->H()V

    .line 698
    .line 699
    .line 700
    throw v9

    .line 701
    :cond_13
    :goto_b
    return-object v4

    .line 702
    :pswitch_8
    check-cast v11, Lsc/k0;

    .line 703
    .line 704
    check-cast v12, Ljava/lang/String;

    .line 705
    .line 706
    iget-object v0, v11, Lsc/k0;->e:Lsc/i0;

    .line 707
    .line 708
    iget-object v2, v11, Lsc/k0;->f:Ljava/lang/String;

    .line 709
    .line 710
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    const-string v3, "name"

    .line 714
    .line 715
    invoke-static {v12, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    const-string v3, "signature"

    .line 719
    .line 720
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    const-string v3, "<init>"

    .line 724
    .line 725
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-eqz v3, :cond_17

    .line 730
    .line 731
    invoke-virtual {v0}, Lsc/i0;->f()Ljava/util/Collection;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    check-cast v3, Ljava/lang/Iterable;

    .line 736
    .line 737
    invoke-static {v3}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    check-cast v3, Ljava/util/Collection;

    .line 742
    .line 743
    move-object v4, v3

    .line 744
    check-cast v4, Ljava/lang/Iterable;

    .line 745
    .line 746
    new-instance v5, Ljava/util/ArrayList;

    .line 747
    .line 748
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 749
    .line 750
    .line 751
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    :cond_14
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 756
    .line 757
    .line 758
    move-result v8

    .line 759
    if-eqz v8, :cond_19

    .line 760
    .line 761
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    move-object v9, v8

    .line 766
    check-cast v9, Lyc/j;

    .line 767
    .line 768
    invoke-interface {v9}, Lyc/j;->U()Z

    .line 769
    .line 770
    .line 771
    move-result v11

    .line 772
    if-eqz v11, :cond_16

    .line 773
    .line 774
    invoke-interface {v9}, Lyc/j;->y()Lyc/i;

    .line 775
    .line 776
    .line 777
    move-result-object v11

    .line 778
    invoke-static {v11, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-static {v11}, Lee/g;->c(Lyc/k;)Z

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    if-eqz v11, :cond_16

    .line 786
    .line 787
    invoke-static {v9}, Lsc/d2;->c(Lyc/t;)Ln7/d;

    .line 788
    .line 789
    .line 790
    move-result-object v11

    .line 791
    invoke-virtual {v11}, Ln7/d;->a()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v11

    .line 795
    const-string v13, "constructor-impl"

    .line 796
    .line 797
    invoke-static {v11, v13, v7}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 798
    .line 799
    .line 800
    move-result v13

    .line 801
    if-eqz v13, :cond_15

    .line 802
    .line 803
    const-string v13, ")V"

    .line 804
    .line 805
    invoke-static {v11, v13, v7}, Lef/u;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 806
    .line 807
    .line 808
    move-result v13

    .line 809
    if-eqz v13, :cond_15

    .line 810
    .line 811
    new-instance v13, Ljava/lang/StringBuilder;

    .line 812
    .line 813
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 814
    .line 815
    .line 816
    const-string v14, "V"

    .line 817
    .line 818
    invoke-static {v11, v14}, Lef/n;->G0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v11

    .line 822
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-interface {v9}, Lyc/j;->y()Lyc/i;

    .line 826
    .line 827
    .line 828
    move-result-object v9

    .line 829
    invoke-static {v9, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v9}, Lie/d;->f(Lyc/h;)Lbe/b;

    .line 833
    .line 834
    .line 835
    move-result-object v9

    .line 836
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v9}, Lbe/b;->b()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v9

    .line 843
    invoke-static {v9}, Lae/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v9

    .line 847
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v9

    .line 854
    goto :goto_d

    .line 855
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 856
    .line 857
    const-string v2, "Invalid signature of "

    .line 858
    .line 859
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    const-string v2, ": "

    .line 866
    .line 867
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 878
    .line 879
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    throw v2

    .line 887
    :cond_16
    invoke-static {v9}, Lsc/d2;->c(Lyc/t;)Ln7/d;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    invoke-virtual {v9}, Ln7/d;->a()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    :goto_d
    invoke-static {v9, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v9

    .line 899
    if-eqz v9, :cond_14

    .line 900
    .line 901
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    goto/16 :goto_c

    .line 905
    .line 906
    :cond_17
    invoke-static {v12}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    invoke-virtual {v0, v3}, Lsc/i0;->g(Lbe/e;)Ljava/util/Collection;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    move-object v4, v3

    .line 915
    check-cast v4, Ljava/lang/Iterable;

    .line 916
    .line 917
    new-instance v5, Ljava/util/ArrayList;

    .line 918
    .line 919
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 920
    .line 921
    .line 922
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 923
    .line 924
    .line 925
    move-result-object v4

    .line 926
    :cond_18
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 927
    .line 928
    .line 929
    move-result v6

    .line 930
    if-eqz v6, :cond_19

    .line 931
    .line 932
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v6

    .line 936
    move-object v7, v6

    .line 937
    check-cast v7, Lyc/t;

    .line 938
    .line 939
    invoke-static {v7}, Lsc/d2;->c(Lyc/t;)Ln7/d;

    .line 940
    .line 941
    .line 942
    move-result-object v7

    .line 943
    invoke-virtual {v7}, Ln7/d;->a()Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v7

    .line 947
    invoke-static {v7, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v7

    .line 951
    if-eqz v7, :cond_18

    .line 952
    .line 953
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    goto :goto_e

    .line 957
    :cond_19
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 958
    .line 959
    .line 960
    move-result v4

    .line 961
    if-eq v4, v10, :cond_1b

    .line 962
    .line 963
    move-object v13, v3

    .line 964
    check-cast v13, Ljava/lang/Iterable;

    .line 965
    .line 966
    sget-object v17, Lsc/c;->j:Lsc/c;

    .line 967
    .line 968
    const/16 v18, 0x1e

    .line 969
    .line 970
    const-string v14, "\n"

    .line 971
    .line 972
    const/4 v15, 0x0

    .line 973
    const/16 v16, 0x0

    .line 974
    .line 975
    invoke-static/range {v13 .. v18}, Lvb/m;->f0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    new-instance v4, Lhc/a;

    .line 980
    .line 981
    new-instance v5, Ljava/lang/StringBuilder;

    .line 982
    .line 983
    const-string v6, "Function \'"

    .line 984
    .line 985
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    .line 990
    .line 991
    const-string v6, "\' (JVM signature: "

    .line 992
    .line 993
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    .line 998
    .line 999
    const-string v2, ") not resolved in "

    .line 1000
    .line 1001
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    const/16 v0, 0x3a

    .line 1008
    .line 1009
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    if-nez v0, :cond_1a

    .line 1017
    .line 1018
    const-string v0, " no members found"

    .line 1019
    .line 1020
    goto :goto_f

    .line 1021
    :cond_1a
    const-string v0, "\n"

    .line 1022
    .line 1023
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    :goto_f
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-direct {v4, v0}, Lhc/a;-><init>(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    throw v4

    .line 1038
    :cond_1b
    invoke-static {v5}, Lvb/m;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    check-cast v0, Lyc/t;

    .line 1043
    .line 1044
    return-object v0

    .line 1045
    :pswitch_9
    check-cast v11, Le7/a0;

    .line 1046
    .line 1047
    check-cast v12, Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-static {v11, v12}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    return-object v8

    .line 1053
    :pswitch_a
    check-cast v11, Lqe/h;

    .line 1054
    .line 1055
    check-cast v12, Lwd/w;

    .line 1056
    .line 1057
    iget-object v0, v11, Lqe/h;->l:Loe/k;

    .line 1058
    .line 1059
    iget-object v0, v0, Loe/k;->a:Loe/i;

    .line 1060
    .line 1061
    iget-object v0, v0, Loe/i;->e:Loe/a;

    .line 1062
    .line 1063
    iget-object v2, v11, Lqe/h;->u:Loe/u;

    .line 1064
    .line 1065
    invoke-interface {v0, v2, v12}, Loe/c;->e(Loe/w;Lwd/w;)Ljava/util/List;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    check-cast v0, Ljava/lang/Iterable;

    .line 1070
    .line 1071
    invoke-static {v0}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    return-object v0

    .line 1076
    :pswitch_b
    check-cast v11, Lb0/w1;

    .line 1077
    .line 1078
    check-cast v12, Lpd/u;

    .line 1079
    .line 1080
    iget-object v0, v11, Lb0/w1;->c:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v0, Lod/a;

    .line 1083
    .line 1084
    iget-object v0, v0, Lod/a;->b:Ldd/b;

    .line 1085
    .line 1086
    iget-object v2, v12, Lpd/u;->o:Lpd/p;

    .line 1087
    .line 1088
    iget-object v2, v2, Lbd/j0;->e:Lbe/c;

    .line 1089
    .line 1090
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    const-string v0, "packageFqName"

    .line 1094
    .line 1095
    invoke-static {v2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    return-object v9

    .line 1099
    :pswitch_c
    check-cast v11, Lid/h;

    .line 1100
    .line 1101
    check-cast v12, Lwd/t0;

    .line 1102
    .line 1103
    iget-object v0, v11, Lid/h;->b:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, Loe/k;

    .line 1106
    .line 1107
    iget-object v2, v0, Loe/k;->a:Loe/i;

    .line 1108
    .line 1109
    iget-object v2, v2, Loe/i;->e:Loe/a;

    .line 1110
    .line 1111
    iget-object v0, v0, Loe/k;->b:Lyd/f;

    .line 1112
    .line 1113
    invoke-interface {v2, v12, v0}, Loe/c;->r(Lwd/t0;Lyd/f;)Ljava/util/ArrayList;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    return-object v0

    .line 1118
    :pswitch_d
    check-cast v11, Lod/d;

    .line 1119
    .line 1120
    check-cast v12, Led/y;

    .line 1121
    .line 1122
    new-instance v0, Lpd/p;

    .line 1123
    .line 1124
    iget-object v2, v11, Lod/d;->a:Lb0/w1;

    .line 1125
    .line 1126
    invoke-direct {v0, v2, v12}, Lpd/p;-><init>(Lb0/w1;Led/y;)V

    .line 1127
    .line 1128
    .line 1129
    return-object v0

    .line 1130
    :pswitch_e
    check-cast v11, Lb0/w1;

    .line 1131
    .line 1132
    check-cast v12, Lzc/h;

    .line 1133
    .line 1134
    invoke-static {v11, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1135
    .line 1136
    .line 1137
    invoke-static {v12, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1138
    .line 1139
    .line 1140
    iget-object v0, v11, Lb0/w1;->c:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v0, Lod/a;

    .line 1143
    .line 1144
    iget-object v0, v0, Lod/a;->q:Lld/b;

    .line 1145
    .line 1146
    iget-object v2, v11, Lb0/w1;->b:Ljava/lang/Object;

    .line 1147
    .line 1148
    invoke-interface {v2}, Lub/h;->getValue()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    check-cast v2, Lld/t;

    .line 1153
    .line 1154
    invoke-virtual {v0, v2, v12}, Lld/b;->b(Lld/t;Lzc/h;)Lld/t;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    return-object v0

    .line 1159
    :pswitch_f
    check-cast v11, Lb0/w1;

    .line 1160
    .line 1161
    check-cast v12, Lyc/g;

    .line 1162
    .line 1163
    invoke-interface {v12}, Lzc/a;->getAnnotations()Lzc/h;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    invoke-static {v11, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    iget-object v2, v11, Lb0/w1;->c:Ljava/lang/Object;

    .line 1174
    .line 1175
    check-cast v2, Lod/a;

    .line 1176
    .line 1177
    iget-object v2, v2, Lod/a;->q:Lld/b;

    .line 1178
    .line 1179
    iget-object v3, v11, Lb0/w1;->b:Ljava/lang/Object;

    .line 1180
    .line 1181
    invoke-interface {v3}, Lub/h;->getValue()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    check-cast v3, Lld/t;

    .line 1186
    .line 1187
    invoke-virtual {v2, v3, v0}, Lld/b;->b(Lld/t;Lzc/h;)Lld/t;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    return-object v0

    .line 1192
    :pswitch_10
    check-cast v11, Lb0/w1;

    .line 1193
    .line 1194
    check-cast v12, Lmd/b;

    .line 1195
    .line 1196
    iget-object v0, v11, Lb0/w1;->c:Ljava/lang/Object;

    .line 1197
    .line 1198
    check-cast v0, Lod/a;

    .line 1199
    .line 1200
    iget-object v0, v0, Lod/a;->o:Lyc/y;

    .line 1201
    .line 1202
    invoke-interface {v0}, Lyc/y;->g()Lvc/i;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    iget-object v2, v12, Lmd/b;->a:Lbe/c;

    .line 1207
    .line 1208
    invoke-virtual {v0, v2}, Lvc/i;->j(Lbe/c;)Lyc/e;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    invoke-interface {v0}, Lyc/e;->E()Lse/a0;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    const-string v2, "getDefaultType(...)"

    .line 1217
    .line 1218
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    return-object v0

    .line 1222
    :pswitch_11
    check-cast v11, Lic/k;

    .line 1223
    .line 1224
    check-cast v12, Lj9/f0;

    .line 1225
    .line 1226
    invoke-interface {v11, v12}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    return-object v8

    .line 1230
    :pswitch_12
    check-cast v12, Lch/p;

    .line 1231
    .line 1232
    check-cast v11, Lch/t;

    .line 1233
    .line 1234
    sget-object v2, Lch/b;->e:Lch/b;

    .line 1235
    .line 1236
    :try_start_0
    invoke-virtual {v11, v10, v1}, Lch/t;->b(ZLbd/i;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    if-eqz v0, :cond_1d

    .line 1241
    .line 1242
    :cond_1c
    invoke-virtual {v11, v7, v1}, Lch/t;->b(ZLbd/i;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    if-nez v0, :cond_1c

    .line 1247
    .line 1248
    sget-object v3, Lch/b;->c:Lch/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1249
    .line 1250
    :try_start_1
    sget-object v0, Lch/b;->h:Lch/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1251
    .line 1252
    invoke-virtual {v12, v3, v0, v9}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V

    .line 1253
    .line 1254
    .line 1255
    :goto_10
    invoke-static {v11}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_12

    .line 1259
    :catchall_0
    move-exception v0

    .line 1260
    goto :goto_13

    .line 1261
    :catch_0
    move-exception v0

    .line 1262
    move-object v9, v0

    .line 1263
    goto :goto_11

    .line 1264
    :catchall_1
    move-exception v0

    .line 1265
    move-object v3, v2

    .line 1266
    goto :goto_13

    .line 1267
    :catch_1
    move-exception v0

    .line 1268
    move-object v9, v0

    .line 1269
    move-object v3, v2

    .line 1270
    goto :goto_11

    .line 1271
    :cond_1d
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 1272
    .line 1273
    const-string v3, "Required SETTINGS preface not received"

    .line 1274
    .line 1275
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1279
    :goto_11
    :try_start_3
    sget-object v0, Lch/b;->d:Lch/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1280
    .line 1281
    invoke-virtual {v12, v0, v0, v9}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V

    .line 1282
    .line 1283
    .line 1284
    goto :goto_10

    .line 1285
    :goto_12
    return-object v8

    .line 1286
    :goto_13
    invoke-virtual {v12, v3, v2, v9}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V

    .line 1287
    .line 1288
    .line 1289
    invoke-static {v11}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 1290
    .line 1291
    .line 1292
    throw v0

    .line 1293
    :pswitch_13
    check-cast v11, Lbd/v0;

    .line 1294
    .line 1295
    move-object/from16 v16, v12

    .line 1296
    .line 1297
    check-cast v16, Lbd/l;

    .line 1298
    .line 1299
    new-instance v17, Lbd/v0;

    .line 1300
    .line 1301
    iget-object v14, v11, Lbd/v0;->D:Lre/o;

    .line 1302
    .line 1303
    iget-object v15, v11, Lbd/v0;->E:Lyc/p0;

    .line 1304
    .line 1305
    move-object/from16 v0, v16

    .line 1306
    .line 1307
    check-cast v0, Landroidx/lifecycle/q;

    .line 1308
    .line 1309
    invoke-virtual {v0}, Landroidx/lifecycle/q;->getAnnotations()Lzc/h;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v18

    .line 1313
    move-object/from16 v0, v16

    .line 1314
    .line 1315
    check-cast v0, Lbd/z;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Lbd/z;->j()I

    .line 1318
    .line 1319
    .line 1320
    move-result v2

    .line 1321
    const-string v3, "getKind(...)"

    .line 1322
    .line 1323
    invoke-static {v2, v3}, Lj2/h0;->y(ILjava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v3, v11, Lbd/v0;->E:Lyc/p0;

    .line 1327
    .line 1328
    move-object v4, v3

    .line 1329
    check-cast v4, Lbd/q;

    .line 1330
    .line 1331
    invoke-virtual {v4}, Lbd/q;->m()Lyc/m0;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v4

    .line 1335
    const-string v6, "getSource(...)"

    .line 1336
    .line 1337
    invoke-static {v4, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    move/from16 v19, v2

    .line 1341
    .line 1342
    move-object/from16 v20, v4

    .line 1343
    .line 1344
    move-object/from16 v13, v17

    .line 1345
    .line 1346
    move-object/from16 v17, v11

    .line 1347
    .line 1348
    invoke-direct/range {v13 .. v20}, Lbd/v0;-><init>(Lre/o;Lyc/p0;Lbd/l;Lbd/u0;Lzc/h;ILyc/m0;)V

    .line 1349
    .line 1350
    .line 1351
    move-object/from16 v17, v13

    .line 1352
    .line 1353
    sget-object v2, Lbd/v0;->G:Lbd/k0;

    .line 1354
    .line 1355
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1356
    .line 1357
    .line 1358
    move-object v2, v3

    .line 1359
    check-cast v2, Lqe/s;

    .line 1360
    .line 1361
    invoke-virtual {v2}, Lqe/s;->D1()Lyc/e;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v4

    .line 1365
    if-nez v4, :cond_1e

    .line 1366
    .line 1367
    move-object v2, v9

    .line 1368
    goto :goto_14

    .line 1369
    :cond_1e
    invoke-virtual {v2}, Lqe/s;->E1()Lse/a0;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v2

    .line 1373
    invoke-static {v2}, Lse/r0;->d(Lse/w;)Lse/r0;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    :goto_14
    if-nez v2, :cond_1f

    .line 1378
    .line 1379
    goto :goto_16

    .line 1380
    :cond_1f
    iget-object v4, v0, Lbd/z;->j:Lbd/a0;

    .line 1381
    .line 1382
    if-eqz v4, :cond_20

    .line 1383
    .line 1384
    invoke-virtual {v4, v2}, Lbd/a0;->E1(Lse/r0;)Lbd/a0;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v9

    .line 1388
    :cond_20
    move-object/from16 v19, v9

    .line 1389
    .line 1390
    invoke-virtual {v0}, Lbd/z;->z0()Ljava/util/List;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    const-string v4, "getContextReceiverParameters(...)"

    .line 1395
    .line 1396
    invoke-static {v0, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    check-cast v0, Ljava/lang/Iterable;

    .line 1400
    .line 1401
    new-instance v4, Ljava/util/ArrayList;

    .line 1402
    .line 1403
    invoke-static {v0, v5}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 1404
    .line 1405
    .line 1406
    move-result v5

    .line 1407
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1408
    .line 1409
    .line 1410
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1415
    .line 1416
    .line 1417
    move-result v5

    .line 1418
    if-eqz v5, :cond_21

    .line 1419
    .line 1420
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v5

    .line 1424
    check-cast v5, Lbd/a0;

    .line 1425
    .line 1426
    invoke-virtual {v5, v2}, Lbd/a0;->E1(Lse/r0;)Lbd/a0;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v5

    .line 1430
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1431
    .line 1432
    .line 1433
    goto :goto_15

    .line 1434
    :cond_21
    check-cast v3, Lbd/h;

    .line 1435
    .line 1436
    invoke-virtual {v3}, Lbd/h;->L()Ljava/util/List;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v21

    .line 1440
    invoke-virtual {v11}, Lbd/z;->o0()Ljava/util/List;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v22

    .line 1444
    iget-object v0, v11, Lbd/z;->g:Lse/w;

    .line 1445
    .line 1446
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 1447
    .line 1448
    .line 1449
    sget-object v24, Lyc/x;->b:Lyc/x;

    .line 1450
    .line 1451
    iget-object v2, v3, Lbd/h;->f:Lld/o;

    .line 1452
    .line 1453
    const/16 v18, 0x0

    .line 1454
    .line 1455
    move-object/from16 v23, v0

    .line 1456
    .line 1457
    move-object/from16 v25, v2

    .line 1458
    .line 1459
    move-object/from16 v20, v4

    .line 1460
    .line 1461
    invoke-virtual/range {v17 .. v25}, Lbd/z;->I1(Lbd/a0;Lbd/a0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lse/w;Lyc/x;Lld/o;)V

    .line 1462
    .line 1463
    .line 1464
    move-object/from16 v9, v17

    .line 1465
    .line 1466
    :goto_16
    return-object v9

    .line 1467
    :pswitch_14
    new-instance v0, Lbf/g;

    .line 1468
    .line 1469
    invoke-direct {v0}, Lbf/g;-><init>()V

    .line 1470
    .line 1471
    .line 1472
    check-cast v12, Lbd/z;

    .line 1473
    .line 1474
    invoke-virtual {v12}, Lbd/z;->A()Ljava/util/Collection;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v2

    .line 1478
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v2

    .line 1482
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v3

    .line 1486
    if-eqz v3, :cond_22

    .line 1487
    .line 1488
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v3

    .line 1492
    check-cast v3, Lyc/t;

    .line 1493
    .line 1494
    move-object v4, v11

    .line 1495
    check-cast v4, Lse/r0;

    .line 1496
    .line 1497
    invoke-interface {v3, v4}, Lyc/t;->h(Lse/r0;)Lyc/t;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    invoke-virtual {v0, v3}, Lbf/g;->add(Ljava/lang/Object;)Z

    .line 1502
    .line 1503
    .line 1504
    goto :goto_17

    .line 1505
    :cond_22
    return-object v0

    .line 1506
    :pswitch_15
    sget-object v0, Lse/h0;->b:Lm0/w;

    .line 1507
    .line 1508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1509
    .line 1510
    .line 1511
    sget-object v0, Lse/h0;->c:Lse/h0;

    .line 1512
    .line 1513
    check-cast v12, Lbd/k;

    .line 1514
    .line 1515
    invoke-virtual {v12}, Lbd/k;->Q()Lse/k0;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1520
    .line 1521
    new-instance v4, Lle/k;

    .line 1522
    .line 1523
    new-instance v5, Lbd/e;

    .line 1524
    .line 1525
    invoke-direct {v5, v10, v1}, Lbd/e;-><init>(ILjava/lang/Object;)V

    .line 1526
    .line 1527
    .line 1528
    sget-object v6, Lre/l;->e:Lre/b;

    .line 1529
    .line 1530
    const-string v8, "NO_LOCKS"

    .line 1531
    .line 1532
    invoke-static {v6, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    invoke-direct {v4, v6, v5}, Lle/k;-><init>(Lre/o;Lic/a;)V

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v3, v4, v0, v2, v7}, Lse/c;->w(Ljava/util/List;Lle/o;Lse/h0;Lse/k0;Z)Lse/a0;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    return-object v0

    .line 1543
    :pswitch_data_0
    .packed-switch 0x0
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
