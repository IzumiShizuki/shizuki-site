.class public final synthetic Lm0/l3;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/l3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln7/v;)V
    .locals 0

    .line 2
    const/16 p1, 0x9

    iput p1, p0, Lm0/l3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lm0/l3;->a:I

    .line 2
    .line 3
    const/high16 v1, 0x43910000    # 290.0f

    .line 4
    .line 5
    const/16 v2, 0x29a

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x534

    .line 9
    .line 10
    const-string v5, "$this$prefsGroup"

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x7

    .line 14
    const/4 v8, 0x1

    .line 15
    const-string v9, "$this$NavHost"

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const-string v11, "it"

    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    sget-object v13, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast p1, Lpc/c;

    .line 27
    .line 28
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ln7/e;->C(Lpc/c;)Lsf/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, Lwf/z0;->g(Lpc/c;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v10, Lsf/d;

    .line 44
    .line 45
    invoke-direct {v10, p1}, Lsf/d;-><init>(Lpc/c;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v10, v0

    .line 50
    :cond_1
    :goto_0
    return-object v10

    .line 51
    :pswitch_0
    check-cast p1, Lq2/k;

    .line 52
    .line 53
    sget-object v0, Lq2/v;->a:[Lpc/u;

    .line 54
    .line 55
    sget-object v0, Lq2/t;->v:Lq2/w;

    .line 56
    .line 57
    invoke-virtual {p1, v0, v13}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v13

    .line 61
    :pswitch_1
    check-cast p1, Lg2/f1;

    .line 62
    .line 63
    return-object v13

    .line 64
    :pswitch_2
    check-cast p1, Le7/x;

    .line 65
    .line 66
    invoke-static {p1, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lr9/f;->c:Lwb/b;

    .line 70
    .line 71
    invoke-virtual {v0, v12}, Lwb/b;->listIterator(I)Ljava/util/ListIterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_1
    move-object v1, v0

    .line 76
    check-cast v1, Lh1/z;

    .line 77
    .line 78
    invoke-virtual {v1}, Lh1/z;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    invoke-virtual {v1}, Lh1/z;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lr9/c;

    .line 89
    .line 90
    iget-object v2, v1, Lr9/c;->a:Ljava/lang/String;

    .line 91
    .line 92
    new-instance v3, La9/o;

    .line 93
    .line 94
    const/4 v4, 0x3

    .line 95
    invoke-direct {v3, v4, v1}, La9/o;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v1, Lf1/f;

    .line 99
    .line 100
    const v4, 0x6ff335ad

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v3, v4, v8}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 104
    .line 105
    .line 106
    sget-object v3, Lvb/r;->a:Lvb/r;

    .line 107
    .line 108
    invoke-static {p1, v2, v3, v3, v1}, Landroid/support/v4/media/session/b;->B(Le7/x;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lf1/f;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    return-object v13

    .line 113
    :pswitch_3
    check-cast p1, Lq/m;

    .line 114
    .line 115
    invoke-static {p1, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v12, v12, v10, v7}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1, v6}, Lq/l0;->c(Lr/u1;I)Lq/r0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :pswitch_4
    check-cast p1, Lq/m;

    .line 128
    .line 129
    invoke-static {p1, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v12, v12, v10, v7}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1, v6}, Lq/l0;->b(Lr/u1;I)Lq/q0;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :pswitch_5
    check-cast p1, Lq/m;

    .line 142
    .line 143
    invoke-static {p1, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v12, v12, v10, v7}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1, v6}, Lq/l0;->c(Lr/u1;I)Lq/r0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :pswitch_6
    check-cast p1, Lq/m;

    .line 156
    .line 157
    invoke-static {p1, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v12, v12, v10, v7}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1, v6}, Lq/l0;->b(Lr/u1;I)Lq/q0;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :pswitch_7
    check-cast p1, Ly8/i;

    .line 170
    .line 171
    invoke-static {p1, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sget-object v0, Lr9/b;->d:Lf1/f;

    .line 175
    .line 176
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lr9/b;->e:Lf1/f;

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 182
    .line 183
    .line 184
    sget-object v0, Lr9/b;->f:Lf1/f;

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 187
    .line 188
    .line 189
    sget-object v0, Lr9/b;->g:Lf1/f;

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 192
    .line 193
    .line 194
    return-object v13

    .line 195
    :pswitch_8
    check-cast p1, Ly8/i;

    .line 196
    .line 197
    invoke-static {p1, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lr9/b;->a:Lf1/f;

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 203
    .line 204
    .line 205
    sget-object v0, Lr9/b;->b:Lf1/f;

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Lr9/b;->c:Lf1/f;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ly8/i;->b(Lic/o;)V

    .line 213
    .line 214
    .line 215
    return-object v13

    .line 216
    :pswitch_9
    check-cast p1, Ly8/i;

    .line 217
    .line 218
    const-string v0, "$this$PrefsScreen"

    .line 219
    .line 220
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const v0, 0x7f0c00f9

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v1, Lm0/l3;

    .line 231
    .line 232
    const/16 v2, 0x14

    .line 233
    .line 234
    invoke-direct {v1, v2}, Lm0/l3;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0, v1}, Ly8/i;->a(Ljava/lang/String;Lic/k;)V

    .line 238
    .line 239
    .line 240
    const v0, 0x7f0c00ce

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v1, Lm0/l3;

    .line 248
    .line 249
    const/16 v2, 0x15

    .line 250
    .line 251
    invoke-direct {v1, v2}, Lm0/l3;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v0, v1}, Ly8/i;->a(Ljava/lang/String;Lic/k;)V

    .line 255
    .line 256
    .line 257
    return-object v13

    .line 258
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    sget-object p1, Lj9/d;->a:Lj9/d;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    sget-boolean p1, Lj9/d;->e:Z

    .line 269
    .line 270
    if-eqz p1, :cond_4

    .line 271
    .line 272
    sget-object p1, Lj9/d;->c:Ljava/lang/ref/WeakReference;

    .line 273
    .line 274
    if-eqz p1, :cond_4

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Landroid/view/View;

    .line 281
    .line 282
    if-eqz p1, :cond_4

    .line 283
    .line 284
    sget-object v0, Lj9/d;->d:Landroid/view/WindowManager$LayoutParams;

    .line 285
    .line 286
    if-eqz v0, :cond_4

    .line 287
    .line 288
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v2, "window"

    .line 293
    .line 294
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    const-string v2, "null cannot be cast to non-null type android.view.WindowManager"

    .line 299
    .line 300
    invoke-static {v1, v2}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    check-cast v1, Landroid/view/WindowManager;

    .line 304
    .line 305
    const v2, -0x7ffffff8

    .line 306
    .line 307
    .line 308
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 309
    .line 310
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 317
    .line 318
    invoke-static {v4}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    const-string v5, "floatingLrcTouch"

    .line 323
    .line 324
    invoke-static {v3, v5, v2, v4}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    sget-object v3, Lj9/d;->b:[Lpc/u;

    .line 329
    .line 330
    aget-object v3, v3, v8

    .line 331
    .line 332
    invoke-virtual {v2, v3}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    check-cast v2, Ljava/lang/Boolean;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-eqz v2, :cond_3

    .line 343
    .line 344
    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 345
    .line 346
    or-int/lit8 v2, v2, 0x10

    .line 347
    .line 348
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 349
    .line 350
    :cond_3
    sget-object v0, Lj9/d;->d:Landroid/view/WindowManager$LayoutParams;

    .line 351
    .line 352
    invoke-interface {v1, p1, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 353
    .line 354
    .line 355
    :cond_4
    return-object v13

    .line 356
    :pswitch_b
    check-cast p1, Lef/j;

    .line 357
    .line 358
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object p1, p1, Lef/j;->a:Ljava/util/regex/Matcher;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    const-string v0, "group(...)"

    .line 368
    .line 369
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-object p1

    .line 373
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 374
    .line 375
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-object v13

    .line 379
    :pswitch_d
    check-cast p1, Lxf/h;

    .line 380
    .line 381
    const-string v0, "$this$Json"

    .line 382
    .line 383
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    iput-boolean v8, p1, Lxf/h;->a:Z

    .line 387
    .line 388
    iput-boolean v8, p1, Lxf/h;->b:Z

    .line 389
    .line 390
    return-object v13

    .line 391
    :pswitch_e
    check-cast p1, Lka/g;

    .line 392
    .line 393
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    sget-object p1, La9/u;->d:Ljava/lang/ref/WeakReference;

    .line 397
    .line 398
    if-eqz p1, :cond_5

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    check-cast p1, Le7/a0;

    .line 405
    .line 406
    if-eqz p1, :cond_5

    .line 407
    .line 408
    const-string v0, "LoginScreen"

    .line 409
    .line 410
    invoke-static {p1, v0}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :cond_5
    return-object v13

    .line 414
    :pswitch_f
    check-cast p1, Lp1/b;

    .line 415
    .line 416
    return-object v13

    .line 417
    :pswitch_10
    check-cast p1, Lz7/c;

    .line 418
    .line 419
    const-string v0, "statement"

    .line 420
    .line 421
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lwb/g;

    .line 425
    .line 426
    invoke-direct {v0}, Lwb/g;-><init>()V

    .line 427
    .line 428
    .line 429
    :goto_2
    invoke-interface {p1}, Lz7/c;->Z()Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_6

    .line 434
    .line 435
    invoke-interface {p1, v12}, Lz7/c;->getLong(I)J

    .line 436
    .line 437
    .line 438
    move-result-wide v1

    .line 439
    long-to-int v2, v1

    .line 440
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v0, v1}, Lwb/g;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_2

    .line 448
    :cond_6
    invoke-static {v0}, Lud/e;->c(Lwb/g;)Lwb/g;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    return-object p1

    .line 453
    :pswitch_11
    check-cast p1, Lz7/c;

    .line 454
    .line 455
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-interface {p1}, Lz7/c;->Z()Z

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    return-object p1

    .line 467
    :pswitch_12
    check-cast p1, Lz7/c;

    .line 468
    .line 469
    invoke-static {p1, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    return-object v13

    .line 473
    :pswitch_13
    check-cast p1, Ln7/b;

    .line 474
    .line 475
    const-string v0, "config"

    .line 476
    .line 477
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    new-instance p1, Lub/j;

    .line 481
    .line 482
    invoke-direct {p1}, Lub/j;-><init>()V

    .line 483
    .line 484
    .line 485
    throw p1

    .line 486
    :pswitch_14
    check-cast p1, Ljava/lang/Float;

    .line 487
    .line 488
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    const v0, 0x3f333333    # 0.7f

    .line 493
    .line 494
    .line 495
    mul-float p1, p1, v0

    .line 496
    .line 497
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    return-object p1

    .line 502
    :pswitch_15
    check-cast p1, Lm0/b2;

    .line 503
    .line 504
    new-instance p1, Lm0/h3;

    .line 505
    .line 506
    sget v0, Lm0/h7;->a:F

    .line 507
    .line 508
    invoke-direct {p1, v0}, Lm0/h3;-><init>(F)V

    .line 509
    .line 510
    .line 511
    return-object p1

    .line 512
    :pswitch_16
    check-cast p1, Lq2/k;

    .line 513
    .line 514
    sget-object v0, Lq2/v;->a:[Lpc/u;

    .line 515
    .line 516
    sget-object v0, Lq2/t;->l:Lq2/w;

    .line 517
    .line 518
    sget-object v1, Lq2/v;->a:[Lpc/u;

    .line 519
    .line 520
    const/4 v2, 0x5

    .line 521
    aget-object v1, v1, v2

    .line 522
    .line 523
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 524
    .line 525
    invoke-virtual {v0, p1, v1}, Lq2/w;->a(Lq2/k;Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    return-object v13

    .line 529
    :pswitch_17
    check-cast p1, Lm0/f3;

    .line 530
    .line 531
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    return-object p1

    .line 539
    :pswitch_18
    check-cast p1, Lr/g0;

    .line 540
    .line 541
    iput v4, p1, Lr/g0;->a:I

    .line 542
    .line 543
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {p1, v0, v2}, Lr/g0;->a(Ljava/lang/Float;I)Lr/f0;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sget-object v2, Lm0/g5;->b:Lr/r;

    .line 552
    .line 553
    iput-object v2, v0, Lr/f0;->b:Lr/v;

    .line 554
    .line 555
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    iget v1, p1, Lr/g0;->a:I

    .line 560
    .line 561
    invoke-virtual {p1, v0, v1}, Lr/g0;->a(Ljava/lang/Float;I)Lr/f0;

    .line 562
    .line 563
    .line 564
    return-object v13

    .line 565
    :pswitch_19
    check-cast p1, Lr/g0;

    .line 566
    .line 567
    iput v4, p1, Lr/g0;->a:I

    .line 568
    .line 569
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {p1, v0, v12}, Lr/g0;->a(Ljava/lang/Float;I)Lr/f0;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    sget-object v3, Lm0/g5;->b:Lr/r;

    .line 578
    .line 579
    iput-object v3, v0, Lr/f0;->b:Lr/v;

    .line 580
    .line 581
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {p1, v0, v2}, Lr/g0;->a(Ljava/lang/Float;I)Lr/f0;

    .line 586
    .line 587
    .line 588
    return-object v13

    .line 589
    :pswitch_1a
    check-cast p1, Lq2/k;

    .line 590
    .line 591
    sget p1, Lm0/a5;->a:F

    .line 592
    .line 593
    return-object v13

    .line 594
    :pswitch_1b
    check-cast p1, Lm0/r4;

    .line 595
    .line 596
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 597
    .line 598
    return-object p1

    .line 599
    :pswitch_1c
    check-cast p1, Lq2/k;

    .line 600
    .line 601
    invoke-static {p1, v12}, Lq2/v;->e(Lq2/k;I)V

    .line 602
    .line 603
    .line 604
    return-object v13

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
