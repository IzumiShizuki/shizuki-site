.class public final synthetic Lea/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    iput p3, p0, Lea/d;->a:I

    iput-object p1, p0, Lea/d;->b:Ljava/lang/String;

    iput-object p4, p0, Lea/d;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lea/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/d;->b:Ljava/lang/String;

    iput-object p2, p0, Lea/d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lea/d;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget-object v3, v0, Lea/d;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lea/d;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v5, 0x1

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
    move-object/from16 v6, p2

    .line 20
    .line 21
    check-cast v6, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    and-int/lit8 v7, v6, 0x3

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x2

    .line 31
    if-eq v7, v9, :cond_0

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v7, 0x0

    .line 36
    :goto_0
    and-int/2addr v6, v5

    .line 37
    invoke-virtual {v1, v6, v7}, Lx0/o;->N(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    new-array v6, v9, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object v4, v6, v8

    .line 46
    .line 47
    aput-object v3, v6, v5

    .line 48
    .line 49
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lx0/z;

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroid/content/res/Resources;

    .line 56
    .line 57
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const v5, 0x7f0c0043

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v5, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    const v28, 0x1fffe

    .line 71
    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    const-wide/16 v8, 0x0

    .line 75
    .line 76
    const-wide/16 v10, 0x0

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const-wide/16 v14, 0x0

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    const/16 v20, 0x0

    .line 89
    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const/16 v23, 0x0

    .line 95
    .line 96
    const/16 v24, 0x0

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    move-object/from16 v25, v1

    .line 101
    .line 102
    invoke-static/range {v6 .. v28}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move-object/from16 v25, v1

    .line 107
    .line 108
    invoke-virtual/range {v25 .. v25}, Lx0/o;->Q()V

    .line 109
    .line 110
    .line 111
    :goto_1
    return-object v2

    .line 112
    :pswitch_0
    move-object/from16 v1, p1

    .line 113
    .line 114
    check-cast v1, Lx0/o;

    .line 115
    .line 116
    move-object/from16 v6, p2

    .line 117
    .line 118
    check-cast v6, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v5}, Lx0/v;->D(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-static {v4, v3, v1, v5}, Lha/b;->b(Ljava/lang/String;Ljava/lang/String;Lx0/o;I)V

    .line 128
    .line 129
    .line 130
    return-object v2

    .line 131
    :pswitch_1
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, Lx0/o;

    .line 134
    .line 135
    move-object/from16 v6, p2

    .line 136
    .line 137
    check-cast v6, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v5}, Lx0/v;->D(I)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {v4, v3, v1, v5}, Lg8/a;->g(Ljava/lang/String;Ljava/lang/String;Lx0/o;I)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :pswitch_2
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, Lx0/o;

    .line 153
    .line 154
    move-object/from16 v6, p2

    .line 155
    .line 156
    check-cast v6, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v5}, Lx0/v;->D(I)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-static {v4, v3, v1, v5}, Lea/a;->a(Ljava/lang/String;Ljava/lang/String;Lx0/o;I)V

    .line 166
    .line 167
    .line 168
    return-object v2

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
