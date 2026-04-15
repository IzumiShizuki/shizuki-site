.class public final Lr/r0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm0/x;Ljava/lang/Object;Lic/p;Lyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lr/r0;->e:I

    .line 1
    iput-object p1, p0, Lr/r0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lr/r0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lr/r0;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lr/q1;Lr/w0;Ljava/lang/Object;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr/r0;->e:I

    .line 3
    iput-object p1, p0, Lr/r0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lr/r0;->g:Ljava/lang/Object;

    iput-object p3, p0, Lr/r0;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lr/w0;Ljava/lang/Object;Lr/q1;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr/r0;->e:I

    .line 2
    iput-object p1, p0, Lr/r0;->g:Ljava/lang/Object;

    iput-object p2, p0, Lr/r0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lr/r0;->i:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr/r0;->e:I

    .line 2
    .line 3
    check-cast p1, Lyb/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lr/r0;

    .line 9
    .line 10
    iget-object v1, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lm0/x;

    .line 13
    .line 14
    iget-object v2, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lic/p;

    .line 17
    .line 18
    iget-object v3, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v2, p1}, Lr/r0;-><init>(Lm0/x;Ljava/lang/Object;Lic/p;Lyb/c;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lr/r0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    new-instance v0, Lr/r0;

    .line 31
    .line 32
    iget-object v1, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lr/w0;

    .line 35
    .line 36
    iget-object v2, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lr/q1;

    .line 39
    .line 40
    iget-object v3, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-direct {v0, v1, v3, v2, p1}, Lr/r0;-><init>(Lr/w0;Ljava/lang/Object;Lr/q1;Lyb/c;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lr/r0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :pswitch_1
    new-instance v0, Lr/r0;

    .line 53
    .line 54
    iget-object v1, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lr/q1;

    .line 57
    .line 58
    iget-object v2, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lr/w0;

    .line 61
    .line 62
    iget-object v3, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-direct {v0, v1, v2, v3, p1}, Lr/r0;-><init>(Lr/q1;Lr/w0;Ljava/lang/Object;Lyb/c;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lr/r0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lr/r0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm0/x;

    .line 9
    .line 10
    iget v1, p0, Lr/r0;->f:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v1, v0, Lm0/x;->l:Lx0/e1;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lm0/r;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {p1, v0, v1}, Lm0/r;-><init>(Lm0/x;I)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lb0/x;

    .line 46
    .line 47
    iget-object v3, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lic/p;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    const/16 v5, 0x15

    .line 53
    .line 54
    invoke-direct {v1, v3, v0, v4, v5}, Lb0/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 55
    .line 56
    .line 57
    iput v2, p0, Lr/r0;->f:I

    .line 58
    .line 59
    invoke-static {p1, v1, p0}, La/a;->p(Lic/a;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 64
    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    :goto_1
    return-object v0

    .line 71
    :pswitch_0
    iget-object v0, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lr/q1;

    .line 74
    .line 75
    iget-object v1, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lr/w0;

    .line 78
    .line 79
    iget v2, p0, Lr/r0;->f:I

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lr/w0;->H1()V

    .line 102
    .line 103
    .line 104
    iget-object p1, v1, Lr/w0;->b:Lx0/e1;

    .line 105
    .line 106
    const-wide/high16 v4, -0x8000000000000000L

    .line 107
    .line 108
    iput-wide v4, v1, Lr/w0;->l:J

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    invoke-virtual {v1, v2}, Lr/w0;->K1(F)V

    .line 112
    .line 113
    .line 114
    iget-object v4, v1, Lr/w0;->c:Lx0/e1;

    .line 115
    .line 116
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    iget-object v5, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 127
    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    const/high16 v4, -0x3f800000    # -4.0f

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    const/high16 v4, -0x3f600000    # -5.0f

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 147
    .line 148
    :goto_2
    invoke-virtual {v0, v5}, Lr/q1;->p(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const-wide/16 v7, 0x0

    .line 152
    .line 153
    invoke-virtual {v0, v7, v8}, Lr/q1;->n(J)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Lr/w0;->K1(F)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v5}, Lr/w0;->x1(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v4}, Lr/q1;->j(F)V

    .line 166
    .line 167
    .line 168
    cmpg-float p1, v4, v6

    .line 169
    .line 170
    if-nez p1, :cond_7

    .line 171
    .line 172
    iput v3, p0, Lr/r0;->f:I

    .line 173
    .line 174
    invoke-static {v1, p0}, Lr/w0;->F1(Lr/w0;Lac/c;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 179
    .line 180
    if-ne p1, v1, :cond_7

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_7
    :goto_3
    invoke-virtual {v0}, Lr/q1;->i()V

    .line 184
    .line 185
    .line 186
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 187
    .line 188
    :goto_4
    return-object v1

    .line 189
    :pswitch_1
    iget-object v0, p0, Lr/r0;->i:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lr/q1;

    .line 192
    .line 193
    iget v1, p0, Lr/r0;->f:I

    .line 194
    .line 195
    const/4 v2, 0x1

    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    if-ne v1, v2, :cond_8

    .line 199
    .line 200
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_9
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    new-instance p1, Lf7/w;

    .line 216
    .line 217
    iget-object v1, p0, Lr/r0;->g:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, Lr/w0;

    .line 220
    .line 221
    iget-object v3, p0, Lr/r0;->h:Ljava/lang/Object;

    .line 222
    .line 223
    const/4 v4, 0x0

    .line 224
    invoke-direct {p1, v1, v3, v0, v4}, Lf7/w;-><init>(Lr/w0;Ljava/lang/Object;Lr/q1;Lyb/c;)V

    .line 225
    .line 226
    .line 227
    iput v2, p0, Lr/r0;->f:I

    .line 228
    .line 229
    invoke-static {p1, p0}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 234
    .line 235
    if-ne p1, v1, :cond_a

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_a
    :goto_5
    invoke-virtual {v0}, Lr/q1;->i()V

    .line 239
    .line 240
    .line 241
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 242
    .line 243
    :goto_6
    return-object v1

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
