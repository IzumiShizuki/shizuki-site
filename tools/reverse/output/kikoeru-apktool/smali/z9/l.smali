.class public final Lz9/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc9/f;


# direct methods
.method public synthetic constructor <init>(Lc9/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz9/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz9/l;->b:Lc9/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
    .line 30
    .line 31
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


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz9/l;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget-object v3, v0, Lz9/l;->b:Lc9/f;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lx0/o;

    .line 18
    .line 19
    move-object/from16 v7, p2

    .line 20
    .line 21
    check-cast v7, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    and-int/lit8 v8, v7, 0x3

    .line 28
    .line 29
    if-eq v8, v5, :cond_0

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    :cond_0
    and-int/lit8 v5, v7, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, v5, v4}, Lx0/o;->N(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v3}, Lc9/f;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const/16 v28, 0xc30

    .line 45
    .line 46
    const v29, 0x1d7fe

    .line 47
    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    const-wide/16 v9, 0x0

    .line 51
    .line 52
    const-wide/16 v11, 0x0

    .line 53
    .line 54
    const/4 v13, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const-wide/16 v15, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const-wide/16 v19, 0x0

    .line 63
    .line 64
    const/16 v21, 0x2

    .line 65
    .line 66
    const/16 v22, 0x0

    .line 67
    .line 68
    const/16 v23, 0x1

    .line 69
    .line 70
    const/16 v24, 0x0

    .line 71
    .line 72
    const/16 v25, 0x0

    .line 73
    .line 74
    const/16 v27, 0x0

    .line 75
    .line 76
    move-object/from16 v26, v1

    .line 77
    .line 78
    invoke-static/range {v7 .. v29}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-object/from16 v26, v1

    .line 83
    .line 84
    invoke-virtual/range {v26 .. v26}, Lx0/o;->Q()V

    .line 85
    .line 86
    .line 87
    :goto_0
    return-object v2

    .line 88
    :pswitch_0
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, Lx0/o;

    .line 91
    .line 92
    move-object/from16 v7, p2

    .line 93
    .line 94
    check-cast v7, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    and-int/lit8 v8, v7, 0x3

    .line 101
    .line 102
    if-eq v8, v5, :cond_2

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const/4 v5, 0x0

    .line 107
    :goto_1
    and-int/2addr v6, v7

    .line 108
    invoke-virtual {v1, v6, v5}, Lx0/o;->N(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_3

    .line 113
    .line 114
    iget-object v3, v3, Lc9/f;->l:Lub/p;

    .line 115
    .line 116
    invoke-virtual {v3}, Lub/p;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/String;

    .line 121
    .line 122
    sget-object v5, Lna/w;->a:Lxf/r;

    .line 123
    .line 124
    const-string v5, "<this>"

    .line 125
    .line 126
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    const/16 v6, 0x32

    .line 134
    .line 135
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const-string v4, "substring(...)"

    .line 144
    .line 145
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/16 v24, 0xc30

    .line 149
    .line 150
    const v25, 0x1d7fe

    .line 151
    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    const-wide/16 v5, 0x0

    .line 155
    .line 156
    const-wide/16 v7, 0x0

    .line 157
    .line 158
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    .line 160
    const-wide/16 v11, 0x0

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const/4 v14, 0x0

    .line 164
    const-wide/16 v15, 0x0

    .line 165
    .line 166
    const/16 v17, 0x2

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const/16 v19, 0x1

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const/16 v23, 0x0

    .line 177
    .line 178
    move-object/from16 v22, v1

    .line 179
    .line 180
    invoke-static/range {v3 .. v25}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    move-object/from16 v22, v1

    .line 185
    .line 186
    invoke-virtual/range {v22 .. v22}, Lx0/o;->Q()V

    .line 187
    .line 188
    .line 189
    :goto_2
    return-object v2

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
