.class public final synthetic Lx4/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp5/y;


# direct methods
.method public synthetic constructor <init>(Lp5/y;IJJ)V
    .locals 0

    .line 1
    const/16 p2, 0x8

    iput p2, p0, Lx4/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/g;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;J)V
    .locals 0

    .line 2
    const/4 p2, 0x7

    iput p2, p0, Lx4/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/g;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lx4/g;->a:I

    iput-object p1, p0, Lx4/g;->b:Lp5/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x2

    iput p2, p0, Lx4/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/g;->b:Lp5/y;

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Lm4/q;Lv4/g;)V
    .locals 0

    .line 5
    const/4 p2, 0x6

    iput p2, p0, Lx4/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/g;->b:Lp5/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lx4/g;->a:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    iget-object v2, p0, Lx4/g;->b:Lp5/y;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 11
    .line 12
    sget v1, Lp4/c0;->a:I

    .line 13
    .line 14
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 15
    .line 16
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 17
    .line 18
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lw4/c;

    .line 23
    .line 24
    const/16 v3, 0xe

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0x408

    .line 30
    .line 31
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 36
    .line 37
    sget v1, Lp4/c0;->a:I

    .line 38
    .line 39
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 40
    .line 41
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 42
    .line 43
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lw4/c;

    .line 48
    .line 49
    const/16 v3, 0xb

    .line 50
    .line 51
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const/16 v3, 0x3f3

    .line 55
    .line 56
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_1
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 61
    .line 62
    sget v2, Lp4/c0;->a:I

    .line 63
    .line 64
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 65
    .line 66
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 67
    .line 68
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v3, Lw4/b;

    .line 73
    .line 74
    invoke-direct {v3, v1}, Lw4/b;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const/16 v1, 0x3f2

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_2
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 84
    .line 85
    sget v1, Lp4/c0;->a:I

    .line 86
    .line 87
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 88
    .line 89
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 90
    .line 91
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, Lw4/c;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 99
    .line 100
    .line 101
    const/16 v3, 0x3f1

    .line 102
    .line 103
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_3
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 108
    .line 109
    sget v1, Lp4/c0;->a:I

    .line 110
    .line 111
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 112
    .line 113
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 114
    .line 115
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v2, Lw4/c;

    .line 120
    .line 121
    const/4 v3, 0x5

    .line 122
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const/16 v3, 0x3f6

    .line 126
    .line 127
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_4
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 132
    .line 133
    sget v1, Lp4/c0;->a:I

    .line 134
    .line 135
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 136
    .line 137
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 138
    .line 139
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v2, Lw4/b;

    .line 144
    .line 145
    const/16 v3, 0xd

    .line 146
    .line 147
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 148
    .line 149
    .line 150
    const/16 v3, 0x3ef

    .line 151
    .line 152
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_5
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 157
    .line 158
    sget v1, Lp4/c0;->a:I

    .line 159
    .line 160
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 161
    .line 162
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 163
    .line 164
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    new-instance v2, Lw4/c;

    .line 169
    .line 170
    const/16 v3, 0x8

    .line 171
    .line 172
    invoke-direct {v2, v3}, Lw4/c;-><init>(I)V

    .line 173
    .line 174
    .line 175
    const/16 v3, 0x3f4

    .line 176
    .line 177
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_6
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 182
    .line 183
    sget v1, Lp4/c0;->a:I

    .line 184
    .line 185
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 186
    .line 187
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 188
    .line 189
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v2, Lm4/d1;

    .line 194
    .line 195
    const/16 v3, 0x1a

    .line 196
    .line 197
    invoke-direct {v2, v3}, Lm4/d1;-><init>(I)V

    .line 198
    .line 199
    .line 200
    const/16 v3, 0x3f0

    .line 201
    .line 202
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_7
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 207
    .line 208
    sget v2, Lp4/c0;->a:I

    .line 209
    .line 210
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 211
    .line 212
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 213
    .line 214
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    new-instance v3, Lw4/c;

    .line 219
    .line 220
    invoke-direct {v3, v1}, Lw4/c;-><init>(I)V

    .line 221
    .line 222
    .line 223
    const/16 v1, 0x407

    .line 224
    .line 225
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :pswitch_8
    iget-object v0, v2, Lp5/y;->c:Lv4/s;

    .line 230
    .line 231
    sget v1, Lp4/c0;->a:I

    .line 232
    .line 233
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 234
    .line 235
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 236
    .line 237
    invoke-virtual {v0}, Lw4/d;->Z()Lw4/a;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    new-instance v2, Lw4/b;

    .line 242
    .line 243
    const/4 v3, 0x7

    .line 244
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 245
    .line 246
    .line 247
    const/16 v3, 0x405

    .line 248
    .line 249
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
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
