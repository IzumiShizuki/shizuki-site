.class public final Lm9/j;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Lx0/w0;

.field public final synthetic h:Lm9/c;


# direct methods
.method public synthetic constructor <init>(Lm9/c;Lx0/w0;Lyb/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm9/j;->e:I

    iput-object p1, p0, Lm9/j;->h:Lm9/c;

    iput-object p2, p0, Lm9/j;->g:Lx0/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lx0/w0;Lm9/c;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm9/j;->e:I

    .line 2
    iput-object p1, p0, Lm9/j;->g:Lx0/w0;

    iput-object p2, p0, Lm9/j;->h:Lm9/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 3

    .line 1
    iget p1, p0, Lm9/j;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lm9/j;

    .line 7
    .line 8
    iget-object v0, p0, Lm9/j;->g:Lx0/w0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v2, p0, Lm9/j;->h:Lm9/c;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lm9/j;-><init>(Lm9/c;Lx0/w0;Lyb/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lm9/j;

    .line 18
    .line 19
    iget-object v0, p0, Lm9/j;->g:Lx0/w0;

    .line 20
    .line 21
    iget-object v1, p0, Lm9/j;->h:Lm9/c;

    .line 22
    .line 23
    invoke-direct {p1, v0, v1, p2}, Lm9/j;-><init>(Lx0/w0;Lm9/c;Lyb/c;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_1
    new-instance p1, Lm9/j;

    .line 28
    .line 29
    iget-object v0, p0, Lm9/j;->g:Lx0/w0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iget-object v2, p0, Lm9/j;->h:Lm9/c;

    .line 33
    .line 34
    invoke-direct {p1, v2, v0, p2, v1}, Lm9/j;-><init>(Lm9/c;Lx0/w0;Lyb/c;I)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lm9/j;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lhf/y;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm9/j;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm9/j;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm9/j;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lhf/y;

    .line 24
    .line 25
    check-cast p2, Lyb/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lm9/j;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lm9/j;

    .line 32
    .line 33
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lm9/j;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p2, Lyb/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lm9/j;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lm9/j;

    .line 49
    .line 50
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lm9/j;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm9/j;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lm9/j;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lm9/j;->g:Lx0/w0;

    .line 29
    .line 30
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    iput v1, p0, Lm9/j;->f:I

    .line 37
    .line 38
    iget-object v0, p0, Lm9/j;->h:Lm9/c;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p0}, Lm9/c;->w(Ljava/lang/String;Lac/i;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 45
    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 50
    .line 51
    :goto_1
    return-object v0

    .line 52
    :pswitch_0
    iget v0, p0, Lm9/j;->f:I

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    if-ne v0, v1, :cond_3

    .line 58
    .line 59
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Laa/f;

    .line 75
    .line 76
    const/16 v0, 0x1b

    .line 77
    .line 78
    iget-object v2, p0, Lm9/j;->g:Lx0/w0;

    .line 79
    .line 80
    invoke-direct {p1, v2, v0}, Laa/f;-><init>(Lx0/w0;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lx0/v;->B(Lic/a;)Li7/n;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v0, Llf/s;

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    iget-object v4, p0, Lm9/j;->h:Lm9/c;

    .line 91
    .line 92
    invoke-direct {v0, p1, v4, v3}, Llf/s;-><init>(Llf/f;Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    new-instance p1, Lg1/d;

    .line 96
    .line 97
    const/16 v3, 0x17

    .line 98
    .line 99
    invoke-direct {p1, v3}, Lg1/d;-><init>(I)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Llf/k;

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    invoke-direct {v3, p1, v0, v5}, Llf/k;-><init>(Lic/k;Llf/f;Lyb/c;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Li7/n;

    .line 109
    .line 110
    const/4 v0, 0x4

    .line 111
    invoke-direct {p1, v0, v3}, Li7/n;-><init>(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Li7/n;

    .line 115
    .line 116
    const/4 v3, 0x3

    .line 117
    invoke-direct {v0, v3, p1}, Li7/n;-><init>(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, Lm9/j;

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    invoke-direct {p1, v4, v2, v5, v3}, Lm9/j;-><init>(Lm9/c;Lx0/w0;Lyb/c;I)V

    .line 124
    .line 125
    .line 126
    iput v1, p0, Lm9/j;->f:I

    .line 127
    .line 128
    invoke-static {v0, p1, p0}, Llf/p0;->h(Llf/f;Lic/n;Lac/i;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 133
    .line 134
    if-ne p1, v0, :cond_5

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    :goto_2
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 138
    .line 139
    :goto_3
    return-object v0

    .line 140
    :pswitch_1
    iget v0, p0, Lm9/j;->f:I

    .line 141
    .line 142
    const/4 v1, 0x1

    .line 143
    if-eqz v0, :cond_7

    .line 144
    .line 145
    if-ne v0, v1, :cond_6

    .line 146
    .line 147
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 154
    .line 155
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lm9/j;->g:Lx0/w0;

    .line 163
    .line 164
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Ljava/lang/String;

    .line 169
    .line 170
    iput v1, p0, Lm9/j;->f:I

    .line 171
    .line 172
    iget-object v0, p0, Lm9/j;->h:Lm9/c;

    .line 173
    .line 174
    invoke-virtual {v0, p1, p0}, Lm9/c;->w(Ljava/lang/String;Lac/i;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 179
    .line 180
    if-ne p1, v0, :cond_8

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    :goto_4
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 184
    .line 185
    :goto_5
    return-object v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
