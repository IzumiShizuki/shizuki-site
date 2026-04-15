.class public final Lz9/i;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Lz9/r;


# direct methods
.method public constructor <init>(Lz9/r;Lyb/c;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lz9/i;->e:I

    sget-object v1, Lj9/b0;->a:Lj9/b0;

    .line 1
    iput-object p1, p0, Lz9/i;->g:Lz9/r;

    invoke-direct {p0, v0, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lz9/r;Lyb/c;I)V
    .locals 0

    .line 2
    iput p3, p0, Lz9/i;->e:I

    iput-object p1, p0, Lz9/i;->g:Lz9/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, Lz9/i;->e:I

    .line 2
    .line 3
    iget-object v0, p0, Lz9/i;->g:Lz9/r;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lz9/i;

    .line 9
    .line 10
    sget-object v1, Lj9/b0;->a:Lj9/b0;

    .line 11
    .line 12
    invoke-direct {p1, v0, p2}, Lz9/i;-><init>(Lz9/r;Lyb/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lz9/i;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {p1, v0, p2, v1}, Lz9/i;-><init>(Lz9/r;Lyb/c;I)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_1
    new-instance p1, Lz9/i;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p1, v0, p2, v1}, Lz9/i;-><init>(Lz9/r;Lyb/c;I)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lz9/i;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lz9/i;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lz9/i;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lz9/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lz9/i;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lz9/i;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lz9/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lz9/i;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lz9/i;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lz9/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lz9/i;->e:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lzb/a;->a:Lzb/a;

    .line 6
    .line 7
    iget-object v3, p0, Lz9/i;->g:Lz9/r;

    .line 8
    .line 9
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, Lj9/b0;->a:Lj9/b0;

    .line 16
    .line 17
    iget-object v0, v3, Lz9/r;->c:Lx0/e1;

    .line 18
    .line 19
    iget v3, p0, Lz9/i;->f:I

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-ne v3, v5, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput v5, p0, Lz9/i;->f:I

    .line 44
    .line 45
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-class v1, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v3, "subtitleDocumentUri"

    .line 56
    .line 57
    const-string v6, ""

    .line 58
    .line 59
    invoke-static {p1, v3, v6, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lhg/b;->a()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    :cond_2
    move-object p1, v4

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v1, Lhf/l0;->a:Lpf/e;

    .line 82
    .line 83
    sget-object v1, Lpf/d;->c:Lpf/d;

    .line 84
    .line 85
    new-instance v3, Le/j;

    .line 86
    .line 87
    const/16 v6, 0xb

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    invoke-direct {v3, p1, v7, v7, v6}, Le/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3, p0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v2, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move-object p1, v4

    .line 101
    :goto_0
    if-ne p1, v2, :cond_2

    .line 102
    .line 103
    :goto_1
    if-ne p1, v2, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p1, Lj9/b0;->b:Llf/b1;

    .line 112
    .line 113
    invoke-virtual {p1}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    new-instance v0, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 126
    .line 127
    .line 128
    new-array p1, v5, [Ljava/lang/Object;

    .line 129
    .line 130
    const/4 v1, 0x0

    .line 131
    aput-object v0, p1, v1

    .line 132
    .line 133
    const v0, 0x7f0c019d

    .line 134
    .line 135
    .line 136
    invoke-static {v0, p1}, Lna/q;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    const/4 v9, 0x0

    .line 141
    const/16 v10, 0x1ff

    .line 142
    .line 143
    const-wide/16 v6, 0x0

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    invoke-static/range {v5 .. v10}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    move-object v2, v4

    .line 150
    :goto_3
    return-object v2

    .line 151
    :pswitch_0
    iget v0, p0, Lz9/i;->f:I

    .line 152
    .line 153
    if-eqz v0, :cond_7

    .line 154
    .line 155
    if-ne v0, v5, :cond_6

    .line 156
    .line 157
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_7
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iput v5, p0, Lz9/i;->f:I

    .line 171
    .line 172
    invoke-virtual {v3, p0}, Lz9/r;->w(Lac/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v2, :cond_8

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_8
    :goto_4
    move-object v2, v4

    .line 180
    :goto_5
    return-object v2

    .line 181
    :pswitch_1
    iget v0, p0, Lz9/i;->f:I

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    if-ne v0, v5, :cond_9

    .line 186
    .line 187
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_a
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iput v5, p0, Lz9/i;->f:I

    .line 201
    .line 202
    invoke-virtual {v3, p0}, Lz9/r;->A(Lac/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, v2, :cond_b

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_b
    :goto_6
    move-object v2, v4

    .line 210
    :goto_7
    return-object v2

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
