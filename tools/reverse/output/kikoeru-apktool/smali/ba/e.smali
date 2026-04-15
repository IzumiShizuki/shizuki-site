.class public final synthetic Lba/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbg/d;Lq9/o;Lbg/p;Lx0/w0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lba/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Lba/e;->e:Ljava/lang/Object;

    iput-object p4, p0, Lba/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lba/e;->a:I

    iput-object p1, p0, Lba/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/e;->d:Ljava/lang/Object;

    iput-object p4, p0, Lba/e;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lx0/w0;Lhg/b;Lx0/w0;I)V
    .locals 0

    .line 3
    iput p5, p0, Lba/e;->a:I

    iput-object p1, p0, Lba/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/e;->e:Ljava/lang/Object;

    iput-object p4, p0, Lba/e;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx0/w0;Lic/k;Lx0/w0;Lx0/w0;)V
    .locals 1

    .line 4
    const/4 v0, 0x5

    iput v0, p0, Lba/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/e;->c:Ljava/lang/Object;

    iput-object p2, p0, Lba/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lba/e;->d:Ljava/lang/Object;

    iput-object p4, p0, Lba/e;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lba/e;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 7
    .line 8
    iget-object v5, p0, Lba/e;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lba/e;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, p0, Lba/e;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, p0, Lba/e;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v8, Lic/k;

    .line 20
    .line 21
    check-cast v7, Lx0/w0;

    .line 22
    .line 23
    check-cast v6, Lhg/b;

    .line 24
    .line 25
    check-cast v5, Lx0/w0;

    .line 26
    .line 27
    invoke-interface {v7}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v1, Lz8/e;->a:[Lpc/u;

    .line 34
    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-virtual {v6, v0, v1}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v7}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-interface {v8, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-interface {v5, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :pswitch_0
    check-cast v8, Ljava/util/Map$Entry;

    .line 56
    .line 57
    check-cast v7, Lx0/w0;

    .line 58
    .line 59
    check-cast v6, Lhg/b;

    .line 60
    .line 61
    check-cast v5, Lx0/w0;

    .line 62
    .line 63
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v7, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v7}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    sget-object v1, Lz8/c;->a:[Lpc/u;

    .line 79
    .line 80
    aget-object v1, v1, v2

    .line 81
    .line 82
    invoke-virtual {v6, v0, v1}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-interface {v5, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v4

    .line 91
    :pswitch_1
    check-cast v8, Lt9/g;

    .line 92
    .line 93
    check-cast v7, Lx0/w0;

    .line 94
    .line 95
    check-cast v5, Lx0/w0;

    .line 96
    .line 97
    check-cast v6, Lx0/w0;

    .line 98
    .line 99
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lt9/a;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v6}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const-string v2, "type"

    .line 119
    .line 120
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v2, "value"

    .line 124
    .line 125
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v8}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-object v3, Lhf/l0;->a:Lpf/e;

    .line 133
    .line 134
    sget-object v3, Lpf/d;->c:Lpf/d;

    .line 135
    .line 136
    new-instance v5, Landroidx/lifecycle/r;

    .line 137
    .line 138
    const/16 v6, 0xe

    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    invoke-direct {v5, v0, v1, v8, v6}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 142
    .line 143
    .line 144
    const/4 v0, 0x2

    .line 145
    invoke-static {v2, v3, v8, v5, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 146
    .line 147
    .line 148
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-interface {v7, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-object v4

    .line 154
    :pswitch_2
    check-cast v7, Lx0/w0;

    .line 155
    .line 156
    check-cast v8, Lic/k;

    .line 157
    .line 158
    check-cast v5, Lx0/w0;

    .line 159
    .line 160
    check-cast v6, Lx0/w0;

    .line 161
    .line 162
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-interface {v7, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/util/List;

    .line 172
    .line 173
    check-cast v0, Ljava/lang/Iterable;

    .line 174
    .line 175
    invoke-static {v0}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-interface {v8, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    const-string v0, ""

    .line 183
    .line 184
    invoke-interface {v6, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 188
    .line 189
    invoke-interface {v5, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object v4

    .line 193
    :pswitch_3
    check-cast v8, Lbg/p0;

    .line 194
    .line 195
    check-cast v7, Lq9/o;

    .line 196
    .line 197
    check-cast v5, Lbg/p;

    .line 198
    .line 199
    check-cast v6, Lfg/f;

    .line 200
    .line 201
    invoke-virtual {v6, v8}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7, v5, v3}, Lq9/o;->w(Lbg/p;Z)V

    .line 205
    .line 206
    .line 207
    return-object v4

    .line 208
    :pswitch_4
    check-cast v8, Lbg/d;

    .line 209
    .line 210
    check-cast v5, Lq9/o;

    .line 211
    .line 212
    check-cast v6, Lbg/p;

    .line 213
    .line 214
    check-cast v7, Lx0/w0;

    .line 215
    .line 216
    invoke-interface {v7, v8}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v6, v3}, Lq9/o;->w(Lbg/p;Z)V

    .line 220
    .line 221
    .line 222
    return-object v4

    .line 223
    :pswitch_5
    check-cast v8, Lbg/u;

    .line 224
    .line 225
    check-cast v7, Lq9/o;

    .line 226
    .line 227
    check-cast v5, Lbg/p;

    .line 228
    .line 229
    check-cast v6, Lfg/f;

    .line 230
    .line 231
    invoke-virtual {v6, v8}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v5, v3}, Lq9/o;->w(Lbg/p;Z)V

    .line 235
    .line 236
    .line 237
    return-object v4

    .line 238
    :pswitch_6
    check-cast v8, Lhf/y;

    .line 239
    .line 240
    move-object v10, v7

    .line 241
    check-cast v10, Ljc/y;

    .line 242
    .line 243
    move-object v11, v5

    .line 244
    check-cast v11, Lm9/c;

    .line 245
    .line 246
    move-object v12, v6

    .line 247
    check-cast v12, Lic/a;

    .line 248
    .line 249
    new-instance v9, Lb0/x;

    .line 250
    .line 251
    const/16 v14, 0x19

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    invoke-direct/range {v9 .. v14}, Lb0/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {v8, v13, v13, v9, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 258
    .line 259
    .line 260
    return-object v4

    .line 261
    :pswitch_7
    check-cast v8, Lhf/y;

    .line 262
    .line 263
    move-object v11, v7

    .line 264
    check-cast v11, Lx0/w0;

    .line 265
    .line 266
    move-object v12, v5

    .line 267
    check-cast v12, Lx0/w0;

    .line 268
    .line 269
    move-object v10, v6

    .line 270
    check-cast v10, Lo1/i;

    .line 271
    .line 272
    invoke-interface {v12}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Ljava/lang/Boolean;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_0

    .line 283
    .line 284
    new-instance v9, Lb0/x;

    .line 285
    .line 286
    const/4 v14, 0x1

    .line 287
    const/4 v13, 0x0

    .line 288
    invoke-direct/range {v9 .. v14}, Lb0/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v8, v13, v13, v9, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 292
    .line 293
    .line 294
    goto :goto_0

    .line 295
    :cond_0
    invoke-interface {v11}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/lang/Boolean;

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    xor-int/2addr v0, v3

    .line 306
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-interface {v11, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :goto_0
    return-object v4

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
