.class public final Lq9/o;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lx0/e1;

.field public c:Lbg/p;

.field public final d:Lx0/e1;

.field public final e:Lfg/f;

.field public final f:Lfg/f;

.field public final g:Lx0/e1;

.field public final h:Lwb/b;

.field public final i:Lx0/e1;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li7/j1;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Li7/j1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Li9/f;

    .line 12
    .line 13
    const/16 v2, 0x1d

    .line 14
    .line 15
    invoke-direct {v1, v2}, Li9/f;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Li7/o0;

    .line 24
    .line 25
    new-instance v4, Li7/i1;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct {v4, v5, v1, v6}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v3, v4, v2, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v3, Li7/o0;->f:Llf/f;

    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lq9/o;->b:Lx0/e1;

    .line 50
    .line 51
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Lq9/o;->d:Lx0/e1;

    .line 58
    .line 59
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-class v2, Lbg/p0;

    .line 64
    .line 65
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v3, "favReviewOrder"

    .line 70
    .line 71
    sget-object v4, Lbg/p0;->a:Lbg/p0;

    .line 72
    .line 73
    invoke-static {v3, v4, v1, v5, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Lq9/o;->e:Lfg/f;

    .line 78
    .line 79
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-class v2, Lbg/u;

    .line 84
    .line 85
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v3, "favQuerySort"

    .line 90
    .line 91
    sget-object v4, Lbg/u;->a:Lbg/u;

    .line 92
    .line 93
    invoke-static {v3, v4, v1, v5, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, Lq9/o;->f:Lfg/f;

    .line 98
    .line 99
    invoke-static {v6}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, p0, Lq9/o;->g:Lx0/e1;

    .line 104
    .line 105
    invoke-static {}, Lud/b;->l()Lwb/b;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const v2, 0x7f0c000c

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Lna/q;->g(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    new-instance v3, Lub/k;

    .line 117
    .line 118
    invoke-direct {v3, v6, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v3}, Lwb/b;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object v2, Lna/o;->d:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {v1, v2}, Lvb/m;->P(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Lud/b;->g(Lwb/b;)Lwb/b;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v1, p0, Lq9/o;->h:Lwb/b;

    .line 134
    .line 135
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, Lq9/o;->i:Lx0/e1;

    .line 140
    .line 141
    return-void
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


# virtual methods
.method public final w(Lbg/p;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lq9/o;->c:Lbg/p;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object p1, p0, Lq9/o;->c:Lbg/p;

    .line 13
    .line 14
    new-instance v0, Li7/j1;

    .line 15
    .line 16
    const/16 v1, 0x14

    .line 17
    .line 18
    invoke-direct {v0, v1}, Li7/j1;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lm0/l2;

    .line 22
    .line 23
    invoke-direct {v1, p0, p2, p1}, Lm0/l2;-><init>(Lq9/o;ZLbg/p;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Li7/o0;

    .line 32
    .line 33
    new-instance v2, Li7/i1;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v2, v3, v1, v4}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v2, p1, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p2, p2, Li7/o0;->f:Llf/f;

    .line 48
    .line 49
    invoke-static {p2, p1}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p2, p0, Lq9/o;->b:Lx0/e1;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final x(Lbg/p;)Z
    .locals 4

    .line 1
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "invalidatePlaylistCache"

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-static {v0, v2, v3, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, La9/i;->d()Lfg/f;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lhg/b;->a()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object v2, p1, Lbg/p;->a:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    :goto_0
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    return p1

    .line 54
    :cond_2
    :goto_1
    invoke-static {}, La9/i;->d()Lfg/f;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Lhg/b;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-virtual {p0, p1, v0}, Lq9/o;->w(Lbg/p;Z)V

    .line 68
    .line 69
    .line 70
    return v0
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
