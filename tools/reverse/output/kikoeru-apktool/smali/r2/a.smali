.class public final Lr2/a;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr2/a;->b:I

    iput-object p2, p0, Lr2/a;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lic/a;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lr2/a;->b:I

    .line 2
    check-cast p1, Ljc/m;

    iput-object p1, p0, Lr2/a;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lr2/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 7
    .line 8
    iget-object v1, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ly2/b0;

    .line 11
    .line 12
    iget-object v1, v1, Ly2/b0;->a:Landroid/view/View;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, v1, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ltc/b0;

    .line 22
    .line 23
    iget-object v0, v0, Ltc/b0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "input_method"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lw1/i0;

    .line 48
    .line 49
    iget v1, v0, Lw1/i0;->l:I

    .line 50
    .line 51
    iget-object v0, v0, Lw1/i0;->i:Lx0/b1;

    .line 52
    .line 53
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lx0/b1;->f(I)V

    .line 66
    .line 67
    .line 68
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_2
    new-instance v0, Lf8/b;

    .line 72
    .line 73
    iget-object v1, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lva/a;

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {v0, v2, v1}, Lf8/b;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_3
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lv0/l0;

    .line 85
    .line 86
    iget-object v1, v0, Lv0/l0;->i:Lx0/e1;

    .line 87
    .line 88
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_1

    .line 99
    .line 100
    iget-object v0, v0, Lv0/l0;->a:Lic/a;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_1
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_4
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lu0/b;

    .line 113
    .line 114
    invoke-static {v0}, Li2/f;->m(Li2/p;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_5
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lu0/a;

    .line 123
    .line 124
    iget-object v0, v0, Lu0/a;->h:Lx0/e1;

    .line 125
    .line 126
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    xor-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_6
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lu/u1;

    .line 151
    .line 152
    iget-boolean v0, v0, Lj1/p;->n:Z

    .line 153
    .line 154
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_7
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Lkf/j;

    .line 162
    .line 163
    invoke-interface {v0}, Lkf/t;->c()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    instance-of v1, v0, Lkf/l;

    .line 168
    .line 169
    if-nez v1, :cond_2

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_2
    const/4 v0, 0x0

    .line 173
    :goto_0
    check-cast v0, Lu/z0;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_8
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Ljc/m;

    .line 179
    .line 180
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_9
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Ls/p1;

    .line 189
    .line 190
    sget-object v1, Ls/c1;->a:Lx0/z;

    .line 191
    .line 192
    invoke-static {v0, v1}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Ls/g;

    .line 197
    .line 198
    iput-object v1, v0, Ls/p1;->A:Ls/g;

    .line 199
    .line 200
    if-eqz v1, :cond_3

    .line 201
    .line 202
    new-instance v2, Ls/f;

    .line 203
    .line 204
    iget-object v3, v1, Ls/g;->a:Landroid/content/Context;

    .line 205
    .line 206
    iget-object v4, v1, Ls/g;->b:Lf3/c;

    .line 207
    .line 208
    iget-wide v5, v1, Ls/g;->c:J

    .line 209
    .line 210
    iget-object v7, v1, Ls/g;->d:Ly/d1;

    .line 211
    .line 212
    invoke-direct/range {v2 .. v7}, Ls/f;-><init>(Landroid/content/Context;Lf3/c;JLy/d1;)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_3
    const/4 v2, 0x0

    .line 217
    :goto_1
    iput-object v2, v0, Ls/p1;->B:Ls/f;

    .line 218
    .line 219
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_a
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Ls/b0;

    .line 225
    .line 226
    iget-object v0, v0, Ls/b0;->v:Lo1/v;

    .line 227
    .line 228
    invoke-static {v0}, Lj2/h0;->z(Lo1/v;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_b
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Ls/w;

    .line 240
    .line 241
    iget-object v0, v0, Ls/w;->H:Lic/a;

    .line 242
    .line 243
    if-eqz v0, :cond_4

    .line 244
    .line 245
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_c
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Ls/d;

    .line 254
    .line 255
    iget-object v0, v0, Ls/d;->v:Lic/a;

    .line 256
    .line 257
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_d
    iget-object v0, p0, Lr2/a;->c:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lr2/b;

    .line 266
    .line 267
    const/4 v1, 0x0

    .line 268
    iput-object v1, v0, Lr2/b;->g:Li3/a;

    .line 269
    .line 270
    const-string v1, "OnPositionedDispatch"

    .line 271
    .line 272
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :try_start_0
    invoke-virtual {v0}, Lr2/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 279
    .line 280
    .line 281
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 282
    .line 283
    return-object v0

    .line 284
    :catchall_0
    move-exception v0

    .line 285
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 286
    .line 287
    .line 288
    throw v0

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
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
